package com.songyang.rpc;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/10/11 9:55
 */
@Component
public class Tut6Client {
    private final RabbitTemplate rabbitTemplate;
    public Tut6Client(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    public Integer send(int msg){
        return  (Integer) rabbitTemplate.convertSendAndReceive("spring.rpc", "rpc", msg);
    }
}
