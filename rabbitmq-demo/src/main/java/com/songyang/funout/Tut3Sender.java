package com.songyang.funout;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/10/11 9:55
 */
@Component
public class Tut3Sender {
    private final RabbitTemplate rabbitTemplate;
    public Tut3Sender(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    public void send(String msg){
        rabbitTemplate.convertAndSend("spring.fanout","",msg);
    }
}
