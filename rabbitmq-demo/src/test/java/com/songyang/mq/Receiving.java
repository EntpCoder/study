package com.songyang.mq;

import com.rabbitmq.client.*;

import java.nio.charset.StandardCharsets;


/**
 * @author Yang Song
 * @date 2022/9/29 18:14
 */
public class Receiving {
    private final static String QUEUE_NAME = "HelloLittleRabbit";
    public static void main(String[] args) throws Exception {
        // 1.创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        // 2.设置参数
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        factory.setPort(5672);
        factory.setVirtualHost("/");
        // 3.创建连接
        // 4.创建管道
        Connection connection = factory.newConnection();
        Channel channel =connection.createChannel();
        // 1.队列名字 2.是否定义成持久化队列 3.是否独立占用本连接 4.是否在不使用队列时，自动删除，5.其他参数
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        // 5.消费消息
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println(" 消息为: '" + message + "'");
        };
        // 1.队列的名字
        // 2.设置为true 消息收到会自动回复,并且消息会在MQ中自动删除，如果设置为false就要手动回复
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,consumerTag -> { });
    }
}
