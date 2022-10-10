package com.songyang.mq.publisherconfirms;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author Yang Song
 * @date 2022/10/9 18:20
 */
public class RabbitUtil implements AutoCloseable {
    private static Connection connection = null;
    static {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("43.143.139.24");
            factory.setUsername("entpcoder");
            factory.setPassword("songyang.top");
            connection = factory.newConnection();
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
    public static Channel getChannel() throws IOException {
        return connection.createChannel();
    }
    @Override
    public void close() throws Exception {
        connection.close();
    }
}
