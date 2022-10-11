package com.songyang.rpc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/11 11:51
 */
@RestController
@RequestMapping("/tut6")
public class Tut6Controller {
    private final Tut6Client client;
    public Tut6Controller(Tut6Client client){
        this.client = client;
    }
    @GetMapping("/send/{num}")
    public Integer send(@PathVariable("num") Integer num){
        return client.send(num);
    }
}
