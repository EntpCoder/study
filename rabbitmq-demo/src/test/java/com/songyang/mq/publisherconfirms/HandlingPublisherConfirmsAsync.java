package com.songyang.mq.publisherconfirms;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmCallback;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author Yang Song
 * @date 2022/10/9 19:25
 */
public class HandlingPublisherConfirmsAsync {
    private static final Long MESSAGE_COUNT = 1000L;
    public static void main(String[] args) throws Exception {
        try(Channel channel = RabbitUtil.getChannel()) {
            String queueName = channel.queueDeclare().getQueue();
            // 开启发布确认
            channel.confirmSelect();
            /*
             * 线程安全有序的一个哈希表，适用于高并发的情况
             * 1.轻松的将序号与消息进行关联
             * 2.轻松批量删除条目 只要给到序列号
             * 3.支持并发访问
             */
            ConcurrentNavigableMap<Long,String> outstandingConfirms = new ConcurrentSkipListMap<>();
            // 确认回调
            ConfirmCallback ackCallback = (sequenceNumber, multiple) -> {
                // 如果是多个确认消息
                if (multiple) {
                    //返回的是小于等于当前序列号的未确认消息 是一个 map
                    ConcurrentNavigableMap<Long, String> confirmed =
                            outstandingConfirms.headMap(sequenceNumber, true);
                    //清除该部分未确认消息
                    confirmed.clear();
                }else{
                    //只清除当前序列号的消息
                    outstandingConfirms.remove(sequenceNumber);
                }
                System.out.println(outstandingConfirms);
            };
            // nack-ed回调
            ConfirmCallback nackCallback = (sequenceNumber, multiple) -> {
                String message = outstandingConfirms.get(sequenceNumber);
                System.out.println("发布的消息"+message+"未被确认，序列号"+sequenceNumber);
            };
            /*
             * 添加一个异步确认的监听器
             * 1.确认收到消息的回调
             * 2.未收到消息的回调
             */
            channel.addConfirmListener(ackCallback,nackCallback);
            for(int i = 0;i < MESSAGE_COUNT;i++){
                String msg = "消息"+i;
                /*
                 * channel.getNextPublishSeqNo()获取下一个消息的序列号
                 * 通过序列号与消息体进行一个关联
                 * 全部都是未确认的消息体
                 */
                outstandingConfirms.put(channel.getNextPublishSeqNo(), msg);
                channel.basicPublish("",queueName,null,msg.getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}
