package com.songyang.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/11 9:54
 */
@RestController
@RequestMapping("/tut5")
public class Tut5Controller {
    private final Tut5Sender sender;
    public Tut5Controller(Tut5Sender sender){
        this.sender = sender;
    }
    @GetMapping("/send/{key}/{msg}")
    public String send(@PathVariable("key") String key,@PathVariable("msg") String msg){
        sender.send(key,msg);
        return "ok";
    }
}
