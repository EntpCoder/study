package com.songyang.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/10 10:43
 */
@RestController
public class TestController {
    private final WebSocket webSocket;
    public TestController(WebSocket webSocket){
        this.webSocket = webSocket;
    }
    @GetMapping("/send")
    public String testSend(){
        webSocket.sendOneMessage("123","测试信息");
        return "ok";
    }
}
