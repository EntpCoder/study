package com.songyang.mq.deadletter;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.nio.charset.StandardCharsets;

/**
 * @author Yang Song
 * @date 2022/10/10 18:21
 * 模拟延时队列消费者
 */
public class Consumer {
    private static final String QUEUE_NAME = "dead_letter_queue";
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        Connection connection = factory.newConnection();
        Channel channel =connection.createChannel();
        System.out.println("等待消息中");
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println(" 消息为: '" + message + "'");
        };
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,consumerTag -> { });
    }
}
