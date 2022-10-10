package com.songyang.mq.funout;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;


/**
 * @author Yang Song
 * @date 2022/10/9 9:00
 */
public class EmitLogTopic {
    private static final String EXCHANGE_NAME = "topic_logs";
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        try(Connection connection = factory.newConnection();
            Channel channel = connection.createChannel()){
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
            String routingKey = "kern.info";
            String message = "内核信息";
            channel.basicPublish(EXCHANGE_NAME,routingKey,null,
                    message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] 发送 '" + routingKey + "':'" + message + "'");
        }
    }
}
