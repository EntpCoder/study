package com.songyang.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/10/11 9:02
 */
@RestController
@RequestMapping("/tut1")
public class Tut1Controller {
    private final Tut1Sender sender;
    public Tut1Controller(Tut1Sender sender){
        this.sender = sender;
    }
    @GetMapping("/send/{msg}")
    public String send(@PathVariable("msg") String msg){
        sender.sendString(msg);
        return "ok";
    }
    @GetMapping("/sendMap/{key}/{msg}")
    public String sendMap(@PathVariable("msg") String msg,@PathVariable("key") String key){
        Map<String,String> map = new HashMap<>(16);
        map.put(key,msg);
        sender.sendMap(map);
        return "ok";
    }
}
