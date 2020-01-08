package com.yjry.common.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisService {

    @Resource
    private RedisTemplate<String, Object> template;

    public void setString(String key, String value) {
        template.opsForValue().set(key, value);
    }

    public <T> void setObject(String key, T object, Class<T> clazz) {
        T value = JSONObject.parseObject(JSON.toJSONString(object), clazz);
        template.opsForValue().set(key, value);
    }

    public <T> T getObject(String key, Class<T> clazz) {
        Object value = template.opsForValue().get(key);
        return JSONObject.parseObject(JSON.toJSONString(value), clazz);
    }


}
