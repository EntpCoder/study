package com.songyang.spring5.xml;

/**
 * @author Yang Song
 * @date 2022/9/15 14:26
 */
public class Orders {
    private String orderName;
    private Double orderPrice;

    public Orders(String orderName, Double orderPrice) {
        this.orderName = orderName;
        this.orderPrice = orderPrice;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
