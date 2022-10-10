package com.songyang.mq.deadletter;

import com.rabbitmq.client.*;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/10/10 14:28
 */
public class DeclareExchangeQueue {
    private static final String NORMAL_EXCHANGE = "normal_exchange";
    private static final String DEAD_LETTER_EXCHANGE = "my_dead_exchange";
    private static final String NORMAL_QUEUE = "normal_queue";
    private static final String DEAD_LETTER_QUEUE = "dead_letter_queue";
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        try(Connection connection = factory.newConnection();
            Channel channel =connection.createChannel()){
            // 创建推送消息的常规交换机
            channel.exchangeDeclare(NORMAL_EXCHANGE, BuiltinExchangeType.DIRECT);
            // 创建死信交换机
            channel.exchangeDeclare(DEAD_LETTER_EXCHANGE,BuiltinExchangeType.DIRECT);
            // 创建队列,并设置死信交换机,和routing-key
            Map<String,Object> map = new HashMap<>();
            map.put("x-dead-letter-exchange",DEAD_LETTER_EXCHANGE);
            map.put("x-dead-letter-routing-key","test.dead");
            channel.queueDeclare(NORMAL_QUEUE,false,false,false,map);
            // 创建死信队列
            channel.queueDeclare(DEAD_LETTER_QUEUE,false,false,false,null);
            // 将普通消息队列和死信队列绑定至各自交换机上
            channel.queueBind(NORMAL_QUEUE,NORMAL_EXCHANGE,"test");
            channel.queueBind(DEAD_LETTER_QUEUE,DEAD_LETTER_EXCHANGE,"test.dead");
        }
    }
}
