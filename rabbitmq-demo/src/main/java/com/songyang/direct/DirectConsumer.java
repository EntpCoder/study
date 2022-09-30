package com.songyang.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/9/30 9:14
 */
@Component
public class DirectConsumer {
    @RabbitHandler
    @RabbitListener(queues = "directQueue1")
    public void getMessage(String msg){
        System.out.println("收到消息："+msg);
    }
}
