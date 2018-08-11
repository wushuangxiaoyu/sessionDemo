package com.demo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * ${DESCRIPTION}
 *
 * @author Yu
 * @create 2018-08-11 13:20
 **/
@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 1800)
@Configuration
public class SessionConfig {

}





