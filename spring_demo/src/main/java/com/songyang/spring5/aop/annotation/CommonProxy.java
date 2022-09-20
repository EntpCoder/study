package com.songyang.spring5.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/9/19 14:50
 */
@Aspect
@Component
@Order(1)
public class CommonProxy {
    @Before("execution(* com.songyang.spring5.aop.annotation.User.add(..))")
    public void before(){
        System.out.println("commonProxyBefore...");
    }
    @After("execution(* com.songyang.spring5.aop.annotation.User.add(..))")
    public void after(){
        System.out.println("commonProxyAfter...");
    }
}
