package com.songyang.funout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 */
@Component
public class FanoutConsumer {

    @RabbitHandler
    @RabbitListener(queues = "fanoutQueue1")
    public void processQueueX(String msg){
        System.out.println("接收到的queue 1中的消息是："+msg);
    }
    @RabbitHandler
    @RabbitListener(queues = "fanoutQueue2")
    public void processQueueY(String msg){
        System.out.println("接收到的queue 2中的消息是："+msg);
    }
    @RabbitHandler
    @RabbitListener(queues = "fanoutQueue3")
    public void processQueueZ(String msg){
        System.out.println("接收到的queue 3中的消息是："+msg);
    }


}
