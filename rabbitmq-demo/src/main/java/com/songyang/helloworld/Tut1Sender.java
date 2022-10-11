package com.songyang.helloworld;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/10/11 8:55
 */
@Component
public class Tut1Sender {
    private final RabbitTemplate rabbitTemplate;
    public Tut1Sender(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    public void sendString(String message){
        rabbitTemplate.convertAndSend("hello.spring",message);
    }
    public void sendMap(Map<String,String> map){
        rabbitTemplate.convertAndSend("hello.spring",map);
    }
}
