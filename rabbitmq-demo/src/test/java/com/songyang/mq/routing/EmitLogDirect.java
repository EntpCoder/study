package com.songyang.mq.routing;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;

/**
 * @author Yang Song
 * @date 2022/10/8 19:20
 */
public class EmitLogDirect {
    private static final String EXCHANGE_NAME = "direct_logs";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
            String severity = "error";
            String message = "执行了xxx";
            channel.basicPublish(EXCHANGE_NAME, severity, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] 发送 '" + severity + "':'" + message + "'");
        }
    }
}
