package com.songyang.direct;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/9/30 9:12
 */
@RestController
public class DirectProducer {
    private final RabbitTemplate rabbitTemplate;
    public DirectProducer(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }
    @GetMapping("/direct")
    public String sendMessage(String message){
        rabbitTemplate.convertAndSend("directExchange1","password",message);
        return "send direct";
    }
}
