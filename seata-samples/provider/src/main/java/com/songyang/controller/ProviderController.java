package com.songyang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/18 10:03
 */
@RestController
public class ProviderController {
    @GetMapping("/feign/echo")
    public String feignEcho(String name){
        return "feignEcho() hi " + name;
    }
}
