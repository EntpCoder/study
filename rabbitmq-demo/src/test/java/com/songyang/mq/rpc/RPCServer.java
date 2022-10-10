package com.songyang.mq.rpc;

import com.rabbitmq.client.*;

import java.nio.charset.StandardCharsets;

/**
 * @author Yang Song
 * @date 2022/10/9 11:12
 */
public class RPCServer {
    private  static  final  String  RPC_QUEUE_NAME = "rpc_queue" ;
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(RPC_QUEUE_NAME,false,false,false,null);
        channel.queuePurge(RPC_QUEUE_NAME);
        // 设置最大接受消息数量
        channel.basicQos(1);
        System.out.println("[x] 等待 RPC 请求...");
        // 当消费消息时触发的函数
        DeliverCallback deliverCallback =  (consumerTag, delivery) -> {
            AMQP.BasicProperties replyProps = new AMQP.BasicProperties
                    .Builder()
                    .correlationId(delivery.getProperties().getCorrelationId())
                    .build();
            String response = "";
            try {
                String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
                int n  = Integer.parseInt(message);
                System.out.println("处理请求中... 请求参数为:"+message);
                response += fib(n);
            }catch (RuntimeException e) {
                System.out.println(" [.] " + e);
            } finally {
                // 发布消息:第二个参数为 回调队列,处理完消息后将结果放回指定队列,第三个参数为
                channel.basicPublish("", delivery.getProperties().getReplyTo(), replyProps,
                        response.getBytes(StandardCharsets.UTF_8));
                channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
                System.out.println("处理完毕，返回消息成功");
            }
        };
        channel.basicConsume(RPC_QUEUE_NAME,false,deliverCallback,consumerTag -> {});
    }
    /**
     * 模拟服务端业务逻辑
     * @param n n
     * @return 值
     */
    private static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
