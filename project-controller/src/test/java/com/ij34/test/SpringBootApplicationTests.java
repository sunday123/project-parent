package com.ij34.test;


import cn.hutool.core.date.DateUtil;
import com.ij34.Application;
import com.ij34.redis.service.StockRedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootApplicationTests {

    @Autowired
    private StockRedisService stockRedisService;

    @Test
    public void testAddUser() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(30);
        for (int i = 0; i < 20; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        Boolean a=stockRedisService.reduce("c");
                        System.out.println( a+"|"+index+"|" +DateUtil.date());
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }

}