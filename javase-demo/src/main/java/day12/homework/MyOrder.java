package day12.homework;

import java.time.LocalDateTime;

/**
 * @author Yang Song
 * @date 2022/8/2 20:15
 */
public class MyOrder {
    private int orderId;
    private int orderNo;
    private float orderPrice;
    LocalDateTime creatDateTime;
    private Customer customer;

    public MyOrder(int orderId, int orderNo, float orderPrice, LocalDateTime creatDateTime, Customer customer) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.orderPrice = orderPrice;
        this.creatDateTime = creatDateTime;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public float getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(float orderPrice) {
        this.orderPrice = orderPrice;
    }

    public LocalDateTime getCreatDateTime() {
        return creatDateTime;
    }

    public void setCreatDateTime(LocalDateTime creatDateTime) {
        this.creatDateTime = creatDateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", orderPrice=" + orderPrice +
                ", creatDateTime=" + creatDateTime +
                ", customer=" + customer +
                '}';
    }
}
