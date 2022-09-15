package com.atzz.redis.springboot_redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author shkstart
 * @create 2022-09-13 16:41
 */
@RestController
@RequestMapping("/redisTest")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis() {
        redisTemplate.opsForValue().set("name","lucy");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }

    @GetMapping
    public String testGit() {
        return "add";
    }

    @GetMapping
    public String testHotFix() {
        return "hot-fix";
    }

    @GetMapping
    public String testMain() {
        return "main1";
    }

}
