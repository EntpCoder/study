package com.songyang.mq.delayedmessage;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/10/10 19:29
 */
public class DeclareDelayedExchangeAndDelayedQueue {
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        try(Connection connection = factory.newConnection();
            Channel channel =connection.createChannel()){
            Map<String, Object> map = new HashMap<>();
            map.put("x-delayed-type", "direct");
            channel.exchangeDeclare("my-delayed-exchange", "x-delayed-message", true, false, map);
            channel.queueDeclare("my-delayed-queue",false,false,false,null);
            channel.queueBind("my-delayed-queue","my-delayed-exchange","delayed.queue");
        }
    }
}
