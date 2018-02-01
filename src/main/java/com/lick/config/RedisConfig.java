package com.lick.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @description： redis配置文件,1.实现session共享
 * @author: lick
 * @date: 2018年01月16日 14:11
 * @copyright: 版权归所有
 */
@Configuration
@EnableRedisHttpSession
public class RedisConfig {
}
