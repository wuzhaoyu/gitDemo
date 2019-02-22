package com.wzy.config;

import com.wzy.common.RedisUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 类功能说明: 注入RedisTemplate操作对象
 * 类修改者	创建日期2019/2/22
 * 修改说明
 * <p>Title: RedisConfig.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
@Configuration
public class RedisConfig {

    public RedisConfig(){

    }
    @Bean(name = {"redisUtils"})
    public RedisUtils redisUtils(RedisTemplate<Object,Object> redisTemplate){
        RedisUtils redisUtils = new RedisUtils();
        redisUtils.setRedisTemplate(redisTemplate);
        return  redisUtils;
    }

}
