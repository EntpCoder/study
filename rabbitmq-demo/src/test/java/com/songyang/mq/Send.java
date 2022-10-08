package com.songyang.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 * @author Yang Song
 * @date 2022/9/29 17:02
 */
public class Send {
    private final static String QUEUE_NAME = "HelloLittleRabbit";
    public static void main(String[] args) {
        // 1.创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        // 2.设置参数
        factory.setHost("43.143.139.24");
        factory.setUsername("entpcoder");
        factory.setPassword("songyang.top");
        factory.setPort(5672);
        factory.setVirtualHost("/");
        // 3.创建连接
        // 4.创建管道
        try(Connection connection = factory.newConnection();
                Channel channel =connection.createChannel()){
            //1.队列名字 2.是否定义成持久化队列 3.是否独立占用本连接 4.是否在不使用队列时，自动删除，5.其他参数
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
            String msg = "测试消息2";
            //1.交换机名字 2.队列名字 3.基本信息 4.数据
            // 5.发送消息
            channel.basicPublish("",QUEUE_NAME,null,msg.getBytes(StandardCharsets.UTF_8));
            System.out.println("发送消息为："+msg);
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
