package com.ij34.redis.service.impl;

import com.ij34.redis.service.StockRedisService;
import org.redisson.api.RBucket;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Description StockRedisServiceImpl
 * Date 2021/9/13
 * Created by www.ij34.com
 */
@Service
public class StockRedisServiceImpl implements StockRedisService {
    static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    static {
        map.put("a", 5);
        map.put("b", 6);
        map.put("c", 5);
    }

    @Resource
    private RedissonClient redissonClient;

    @Override
    public Boolean reduce(String key) {

        if (!map.containsKey(key)) {
            return false;
        }
        String key1 = "2021-09-18" + key;
        RLock lock = redissonClient.getLock("lock_" + key1);
        try {
            Boolean flag = lock.tryLock(2, 10, TimeUnit.SECONDS);
            RBucket<Integer> bucket = redissonClient.getBucket(key1);
            if (!bucket.isExists()) {
                bucket.set(map.get(key), 1, TimeUnit.HOURS);
            }
            bucket = redissonClient.getBucket(key1);
            Integer count = bucket.get();
            if (count < 1) {
                return false;
            }
            bucket.compareAndSet(count, count - 1);
            bucket.expire(1, TimeUnit.HOURS);

            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return null;
    }
}
