package com.songyang.mq.workqueues;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import java.nio.charset.StandardCharsets;

/**
 * @author Yang Song
 * @date 2022/10/8 11:00
 */
public class Worker {
    private static final String TASK_QUEUE_NAME = "task_queue";
    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        final Connection connection = factory.newConnection();
        final Channel channel = connection.createChannel();
        channel.queueDeclare(TASK_QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] 等待消息...");
        channel.basicQos(1);
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println(" [x] 收到 '" + message + "'");
            try {
                doWork(message);
            } finally {
                System.out.println(" [x] 成功");
                channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
            }
        };
        //                  队列名字            是否自动消息确认
        channel.basicConsume(TASK_QUEUE_NAME, false, deliverCallback, consumerTag -> { });
    }
    private static void doWork(String task) {
        for (char ch : task.toCharArray()) {
            if (ch == '.') {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException _ignored) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
