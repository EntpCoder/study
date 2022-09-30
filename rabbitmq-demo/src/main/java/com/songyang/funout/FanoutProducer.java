package com.songyang.funout;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanoutProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("fanout")
    public String sendMsg(@RequestParam("message") String message){
        rabbitTemplate.convertAndSend("fanoutExchange1",null,message);
        return "ok";
    }
}
