package com.songyang.mq.deadletter;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;

/**
 * @author Yang Song
 * @date 2022/10/10 15:02
 * 死信测试
 */
public class Producer {
    private static final String NORMAL_EXCHANGE = "normal_exchange";
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        try(Connection connection = factory.newConnection();
            Channel channel =connection.createChannel()) {
            AMQP.BasicProperties properties =
                    new AMQP.BasicProperties.Builder().expiration("10000").build();
            String msg = "宋洋洋2";
            channel.basicPublish(NORMAL_EXCHANGE,"test",properties,msg.getBytes(StandardCharsets.UTF_8));
        }
    }
}
