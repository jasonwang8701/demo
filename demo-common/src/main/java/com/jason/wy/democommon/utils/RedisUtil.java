package com.jason.wy.democommon.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-06 16:09
 */

@Component
public class RedisUtil {


    @Resource
    RedisTemplate redisTemplate;

    /**
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, String value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * @param key
     * @return
     */

    public boolean hasKey(String key) {
        try {
            return redisTemplate.hasKey(key);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * @param key
     * @return
     */
    public String get(String key) {
        return key == null ? null : String.valueOf(redisTemplate.opsForValue().get(key));
    }

}
