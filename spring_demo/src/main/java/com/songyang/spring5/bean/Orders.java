package com.songyang.spring5.bean;

import org.aspectj.weaver.ast.Or;

/**
 * @author Yang Song
 * @date 2022/9/16 16:22
 */
public class Orders {
    private String orderName;
    public Orders(){
        System.out.println("1.无参构造函数...");
    }
    public void setOrderName(String orderName) {
        System.out.println("2.setter...");
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }

    /**
     * bean初始化方法
     */
    public void initMethod(){
        System.out.println("3.执行初始化方法");
    }
    /**
     * bean销毁方法
     */
    public void destroy(){
        System.out.println("5.执行销毁方法");
    }
}
