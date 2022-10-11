package com.songyang.driect;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Yang Song
 * @date 2022/10/11 9:41
 */
@Profile({"tut4"})
@Configuration
public class Tut4Config {
    @Bean
    public DirectExchange direct(){
        return new DirectExchange("spring.direct");
    }
    private static class ReceiverConfig{
        @Bean
        public Queue autoDeleteQueue1() {
            return new AnonymousQueue();
        }

        @Bean
        public Queue autoDeleteQueue2() {
            return new AnonymousQueue();
        }
        @Bean
        public Binding binding1a(DirectExchange direct,Queue autoDeleteQueue1){
            return BindingBuilder.bind(autoDeleteQueue1).to(direct).with("error");
        }
        @Bean
        public Binding binding2a(DirectExchange direct,Queue autoDeleteQueue2){
            return BindingBuilder.bind(autoDeleteQueue2).to(direct).with("info");
        }
        @Bean
        public Binding binding2b(DirectExchange direct,Queue autoDeleteQueue2){
            return BindingBuilder.bind(autoDeleteQueue2).to(direct).with("error");
        }
        @Bean
        public Binding binding2c(DirectExchange direct,Queue autoDeleteQueue2){
            return BindingBuilder.bind(autoDeleteQueue2).to(direct).with("warning");
        }
    }
}
