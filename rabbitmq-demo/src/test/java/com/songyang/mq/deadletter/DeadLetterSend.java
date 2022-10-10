package com.songyang.mq.deadletter;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;

/**
 * @author Yang Song
 * @date 2022/10/10 18:26
 * 死信队列模拟延时队列
 */
public class DeadLetterSend {
    private static final String NORMAL_EXCHANGE = "normal_exchange";
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        try(Connection connection = factory.newConnection();
            Channel channel =connection.createChannel()) {
            AMQP.BasicProperties properties1 =
                    new AMQP.BasicProperties.Builder().expiration("60000").build();
            String msg1 = "消息1";
            channel.basicPublish(NORMAL_EXCHANGE,"test",properties1,msg1.getBytes(StandardCharsets.UTF_8));
            AMQP.BasicProperties properties2 =
                    new AMQP.BasicProperties.Builder().expiration("10000").build();
            String msg2 = "消息2";
            channel.basicPublish(NORMAL_EXCHANGE,"test",properties2,msg2.getBytes(StandardCharsets.UTF_8));
        }
    }
}
