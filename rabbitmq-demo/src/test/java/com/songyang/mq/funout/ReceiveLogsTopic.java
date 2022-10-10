package com.songyang.mq.funout;

import com.rabbitmq.client.*;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author Yang Song
 * @date 2022/10/9 9:42
 */
public class ReceiveLogsTopic{
    private static final String EXCHANGE_NAME = "topic_logs";
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.TOPIC);
        String queueName = channel.queueDeclare().getQueue();
        if (args.length < 1) {
            System.err.println("Please Binding key...");
            System.exit(1);
        }
        for(String bindingKey:args){
            channel.queueBind(queueName,EXCHANGE_NAME,bindingKey);
        }
        System.out.println("binding key:"+ Arrays.toString(args));
        System.out.println(" [*] 等待消息中... ");
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println(" [x] 收到 '" +
                    delivery.getEnvelope().getRoutingKey() + "':'" + message + "'");
        };
        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> { });
    }
}
