package com.songyang.mq.routing;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author Yang Song
 * @date 2022/10/8 19:28
 */
public class ReceiveLogsDirect {
    private static final String EXCHANGE_NAME = "direct_logs";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        // 创建临时队列
        String queueName = channel.queueDeclare().getQueue();
        if (argv.length < 1) {
            System.err.println("Usage: ReceiveLogsDirect [info] [warning] [error]");
            System.exit(1);
        }
        System.out.println("绑定了key:"+Arrays.toString(argv));

        for (String severity : argv) {
            channel.queueBind(queueName, EXCHANGE_NAME, severity);
        }
        System.out.println(" [*] 等待消息中");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println(" [x] 接收到 '" +
                    delivery.getEnvelope().getRoutingKey() + "':'" + message + "'");
        };
        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> { });
    }
}
