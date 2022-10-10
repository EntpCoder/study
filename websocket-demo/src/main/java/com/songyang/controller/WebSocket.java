package com.songyang.controller;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Yang Song
 * @date 2022/10/10 9:55
 */
@Component
@ServerEndpoint("/websocket/{userId}")
public class WebSocket {
    private Session session;
    private String userId;
    /**
     * 用于存在线用户
     */
    private static final ConcurrentHashMap<String,WebSocket> SESSION_POOL = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String,String> POINT_TO_POINT = new ConcurrentHashMap<>();
    @OnOpen
    public void onOpen(Session session, @PathParam(value = "userId") String userId){
        this.session = session;
        this.userId = userId;
        SESSION_POOL.put(userId,this);
        System.out.println("用户:"+userId+"和服务端建立连接");
        System.out.println(SESSION_POOL);
    }
    @OnMessage
    public void onMessage(String message){
        if(POINT_TO_POINT.containsKey(userId)){
            System.out.println("收到"+userId+"消息："+message);
            sendOneMessage(POINT_TO_POINT.get(userId),message);
        }else {
            System.out.println("建立连接");
            POINT_TO_POINT.put(userId,message);
            System.out.println(POINT_TO_POINT);
        }
    }
    @OnError
    public void onError(Session session,Throwable error){
        System.out.println("错误");
    }
    @OnClose
    public void onClose(){
        SESSION_POOL.remove(this.userId);
        POINT_TO_POINT.remove(this.userId);
        System.out.println("关闭链接");
        System.out.println(SESSION_POOL);
    }
    public void sendOneMessage(String userId,String message){
        Session session = SESSION_POOL.get(userId).session;
        if(session!=null && session.isOpen()){
            session.getAsyncRemote().sendText(this.userId+":"+message);
        }
    }
}
