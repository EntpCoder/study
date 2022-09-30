package com.songyang.direct;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yang Song
 * @date 2022/9/30 9:06
 */
@Configuration
public class MyBean {
    @Bean
    public DirectExchange newExchange(){
        return new DirectExchange("directExchange1",true,false);
    }
    @Bean
    public Queue newQueue(){
        return new Queue("directQueue1",true);
    }
    @Bean
    public Binding bind(){
        return BindingBuilder.bind(newQueue()).to(newExchange()).with("password");
    }
}
