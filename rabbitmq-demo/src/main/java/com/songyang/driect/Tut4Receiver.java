package com.songyang.driect;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/10/11 10:22
 */
@Component
@Profile("tut4")
public class Tut4Receiver {
    @RabbitListener(queues = "#{autoDeleteQueue1.name}")
    public void receive1(String msg){
        System.out.println("队列1收到消息"+msg);
    }
    @RabbitListener(queues = "#{autoDeleteQueue2.name}")
    public void receive2(String msg){
        System.out.println("队列2收到消息"+msg);
        int i  = 10/0;
    }
}
