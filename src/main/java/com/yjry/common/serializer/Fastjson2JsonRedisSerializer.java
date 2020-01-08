package com.yjry.common.serializer;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class Fastjson2JsonRedisSerializer<T> implements RedisSerializer<T> {
    @Override
    public byte[] serialize(T t) throws SerializationException {
        return new byte[0];
    }

    @Override
    public T deserialize(byte[] bytes) throws SerializationException {
        return null;
    }
}
