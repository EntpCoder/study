package com.songyang.mq.delayedmessage;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/10/10 19:39
 */
public class Producer {
    private static final String DELAYED_EXCHANGE = "my-delayed-exchange";
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        try(Connection connection = factory.newConnection();
            Channel channel =connection.createChannel()) {
            Map<String,Object> headers1 = new HashMap<>();
            headers1.put("x-delay",60000);
            AMQP.BasicProperties properties1 =
                    new AMQP.BasicProperties.Builder().headers(headers1).build();
            String msg1 = "延时消息测试1";
            channel.basicPublish(DELAYED_EXCHANGE,"delayed.queue",properties1,msg1.getBytes(StandardCharsets.UTF_8));
            Map<String,Object> headers2 = new HashMap<>();
            headers2.put("x-delay",10000);
            AMQP.BasicProperties properties2 =
                    new AMQP.BasicProperties.Builder().headers(headers2).build();
            String msg2 = "延时消息测试2";
            channel.basicPublish(DELAYED_EXCHANGE,"delayed.queue",properties2,msg2.getBytes(StandardCharsets.UTF_8));
        }
    }
}
