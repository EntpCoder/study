package com.songyang.funout;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/11 9:54
 */
@RestController
@RequestMapping("/tut3")
public class Tut3Controller {
    private final Tut3Sender sender;
    public Tut3Controller(Tut3Sender sender){
        this.sender = sender;
    }
    @GetMapping("/send/{msg}")
    public String send(@PathVariable("msg") String msg){
        sender.send(msg);
        return "ok";
    }
}
