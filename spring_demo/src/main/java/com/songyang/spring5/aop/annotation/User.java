package com.songyang.spring5.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/9/19 14:11
 */
@Component
public class User {
    public void add(){
        //int i = 1/0;
        System.out.println("target method");
    }
}
