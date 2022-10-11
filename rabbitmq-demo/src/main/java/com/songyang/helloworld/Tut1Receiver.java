package com.songyang.helloworld;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/10/11 9:17
 */
@Component
@RabbitListener(queues = {"hello.spring"})
public class Tut1Receiver {
    @RabbitHandler
    public void helloSpringString(String message){
        System.out.println("收到字符串消息:"+message);
    }
    @RabbitHandler
    public void helloSpringMap(Map<String,String> map){
        System.out.println("收到Map消息:"+map);
    }
}
