package com.songyang.funout;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Yang Song
 * @date 2022/10/11 9:41
 */
@Profile({"tut3"})
@Configuration
public class Tut3Config {
    @Bean
    public FanoutExchange fanout(){
        return new FanoutExchange("spring.fanout");
    }
    private static class ReceiverConfig{
        @Bean
        public Queue autoDeleteQueue1(){
            return new AnonymousQueue();
        }
        @Bean
        public Queue autoDeleteQueue2(){
            return new AnonymousQueue();
        }
        @Bean
        public Binding binding1(FanoutExchange fanout, Queue autoDeleteQueue1){
            return BindingBuilder.bind(autoDeleteQueue1).to(fanout);
        }
        @Bean
        public Binding binding2(FanoutExchange fanout,Queue autoDeleteQueue2){
            return BindingBuilder.bind(autoDeleteQueue2).to(fanout);
        }
    }
}
