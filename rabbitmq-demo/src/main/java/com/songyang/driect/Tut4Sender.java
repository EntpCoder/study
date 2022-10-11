package com.songyang.driect;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/10/11 9:55
 */
@Component
public class Tut4Sender {
    private final RabbitTemplate rabbitTemplate;
    public Tut4Sender(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    public void send(String key,String msg){
        rabbitTemplate.convertAndSend("spring.direct",key,msg);
    }
}
