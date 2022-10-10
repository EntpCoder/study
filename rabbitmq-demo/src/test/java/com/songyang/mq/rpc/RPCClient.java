package com.songyang.mq.rpc;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @author Yang Song
 * @date 2022/10/9 13:33
 */
public class RPCClient implements AutoCloseable{
    private final Connection connection;
    private final Channel channel;

    public RPCClient()  throws IOException, TimeoutException{
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        connection = factory.newConnection();
        channel= connection.createChannel();
    }
    public String call(String message) throws IOException, InterruptedException, ExecutionException {
        final String corrId = UUID.randomUUID().toString();
        String requestQueueName = "rpc_queue";
        String replyQueueName  = channel.queueDeclare().getQueue();
        AMQP.BasicProperties props  = new AMQP.BasicProperties
                .Builder()
                .correlationId(corrId)
                .replyTo(replyQueueName)
                .build();
        channel.basicPublish("", requestQueueName,props,message.getBytes(StandardCharsets.UTF_8));
        final CompletableFuture<String> response = new CompletableFuture<>();
        String ctag = channel.basicConsume(replyQueueName, true, (consumerTag, delivery) -> {
            if (delivery.getProperties().getCorrelationId().equals(corrId)) {
                response.complete(new String(delivery.getBody(), StandardCharsets.UTF_8));
            }
        }, consumerTag -> {});
        String result = response.get();
        channel.basicCancel(ctag);
        return result;
    }
    @Override
    public void close() throws IOException {
        connection.close();
    }
}
