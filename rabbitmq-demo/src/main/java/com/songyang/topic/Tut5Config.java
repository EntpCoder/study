package com.songyang.topic;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Yang Song
 * @date 2022/10/11 9:41
 */
@Profile({"tut5"})
@Configuration
public class Tut5Config {
    @Bean
    public TopicExchange topic(){
        return new TopicExchange("spring.topic");
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
        public Binding binding1a(TopicExchange topic,Queue autoDeleteQueue1){
            return BindingBuilder.bind(autoDeleteQueue1).to(topic).with("*.orange.*");
        }
        @Bean
        public Binding binding1b(TopicExchange topic,Queue autoDeleteQueue1){
            return BindingBuilder.bind(autoDeleteQueue1).to(topic).with("*.*.rabbit");
        }
        @Bean
        public Binding binding2a(TopicExchange topic,Queue autoDeleteQueue2){
            return BindingBuilder.bind(autoDeleteQueue2).to(topic).with("lazy.#");
        }
    }
}
