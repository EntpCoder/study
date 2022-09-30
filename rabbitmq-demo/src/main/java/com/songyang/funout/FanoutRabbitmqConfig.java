package com.songyang.funout;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1. 创建交换机
 * 2、创建队列 XYZ
 * 3. 绑定
 */
@Configuration
public class FanoutRabbitmqConfig {
    @Bean
    public FanoutExchange newFanoutExchange(){
        return new FanoutExchange("fanoutExchange1",true,false);
    }
    @Bean
    public Queue newQueue1(){
        return new Queue("fanoutQueue1",true);
    }
    @Bean
    public Queue newQueue2(){
        return new Queue("fanoutQueue2",true);
    }
    @Bean
    public Queue newQueue3(){
        return new Queue("fanoutQueue3",true);
    }
    @Bean
    public Binding bingQueueX(){
        return BindingBuilder.bind(newQueue1()).to(newFanoutExchange());
    }
    @Bean
    public Binding bingQueueY(){
        return BindingBuilder.bind(newQueue2()).to(newFanoutExchange());
    }
    @Bean
    public Binding bingQueueZ(){
        return  BindingBuilder.bind(newQueue3()).to(newFanoutExchange());
    }

}
