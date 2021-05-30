package com.ij34.redis.controller;

import com.ij34.redis.dao.RedisDelayedQueue;
import com.ij34.redis.model.TaskBodyDTO;
import com.ij34.redis.service.impl.TestListener;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * </p >
 *
 * @author lin
 * @since 2021-05-30
 */
@Api(tags = "redis")
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    RedisDelayedQueue redisDelayedQueue;

    @ApiOperation(value = "延迟消息")
    @GetMapping("/set")
    public Boolean set() {
        TaskBodyDTO taskBody = new TaskBodyDTO();
        taskBody.setBody("测试DTO实体类的BODY,3秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,3秒之后执行");
        //添加队列3秒之后执行
        redisDelayedQueue.addQueue(taskBody, 10, TimeUnit.SECONDS, TestListener.class.getName());

        taskBody.setBody("测试DTO实体类的BODY,10秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,10秒之后执行");
        //添加队列10秒之后执行
        redisDelayedQueue.addQueue(taskBody, 20, TimeUnit.SECONDS, TestListener.class.getName());

        taskBody.setBody("测试DTO实体类的BODY,20秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,20秒之后执行");
        //添加队列20秒之后执行
        redisDelayedQueue.addQueue(taskBody, 30, TimeUnit.SECONDS, TestListener.class.getName());
        return true;
    }

}
