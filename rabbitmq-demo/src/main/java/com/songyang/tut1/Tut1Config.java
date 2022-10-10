package com.songyang.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * @author Yang Song
 * @date 2022/10/10 21:12
 */
@Profile({"tut1"})
@Configuration
public class Tut1Config {
    @Bean
    public Queue hello(){
        return new Queue("hello.spring");
    }
}
