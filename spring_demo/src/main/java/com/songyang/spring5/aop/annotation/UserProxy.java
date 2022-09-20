package com.songyang.spring5.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 * @author Yang Song
 * @date 2022/9/19 14:12
 */
@Aspect
@Component
@Order(0)
public class UserProxy {
    @Pointcut("execution(* com.songyang.spring5.aop.annotation.User.add(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void before(){
        System.out.println("before...");
    }
    @After("execution(* com.songyang.spring5.aop.annotation.User.add(..))")
    public void after(){
        System.out.println("after...");
    }
    @AfterReturning("execution(* com.songyang.spring5.aop.annotation.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }
    @Around("execution(* com.songyang.spring5.aop.annotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("aroundBefore...");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("aroundAfter...");
    }
    @AfterThrowing("execution(* com.songyang.spring5.aop.annotation.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }
}
