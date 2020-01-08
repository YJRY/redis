package com.yjry.common.controller;

import com.yjry.common.bean.User;
import com.yjry.common.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

//    @Resource
//    private RedisService<String> redisService;
//
//    @GetMapping("/setString")
//    public String setString(String key, String value) {
//        redisService.setString(key, value);
//        return "success";
//    }

    @Resource
    private RedisService redisService;

    @GetMapping("/setObject")
    public String set(String key, User user) {
        redisService.setObject(key, user, User.class);
        return "success";
    }

    @GetMapping("/getObject")
    public User set(String key) {
        return redisService.getObject(key, User.class);
    }

}
