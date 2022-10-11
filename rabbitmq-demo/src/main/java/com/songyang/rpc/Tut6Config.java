package com.songyang.rpc;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Yang Song
 * @date 2022/10/11 9:41
 */
@Profile({"tut6"})
@Configuration
public class Tut6Config {
    @Bean
    public DirectExchange exchange(){
        return new DirectExchange("spring.rpc");
    }
    @Bean
    public Queue queue(){
        return new Queue("rpc.request");
    }
    @Bean
    public Binding binding(DirectExchange exchange,Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with("rpc");
    }
}
