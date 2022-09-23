package com.songyang.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 订单号
     */
    private String orderNum;

    /**
     * 订单状态	            10：待付款	            20：已付款
     */
    private String orderStatus;

    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 实际支付金额
     */
    private BigDecimal paidAmount;

    /**
     * 产品表外键ID
     */
    private String productId;

    /**
     * 订单标题
     */
    private String orderSubject;

    /**
     * 产品购买的个数
     */
    private Integer buyCounts;

    /**
     * 订单创建时间
     */
    private LocalDateTime createTime;

    /**
     * 支付时间
     */
    private LocalDateTime paidTime;

    /**
     * 用户id
     */
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderSubject() {
        return orderSubject;
    }

    public void setOrderSubject(String orderSubject) {
        this.orderSubject = orderSubject;
    }

    public Integer getBuyCounts() {
        return buyCounts;
    }

    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(LocalDateTime paidTime) {
        this.paidTime = paidTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Orders{" +
            "id = " + id +
            ", orderNum = " + orderNum +
            ", orderStatus = " + orderStatus +
            ", orderAmount = " + orderAmount +
            ", paidAmount = " + paidAmount +
            ", productId = " + productId +
            ", orderSubject = " + orderSubject +
            ", buyCounts = " + buyCounts +
            ", createTime = " + createTime +
            ", paidTime = " + paidTime +
            ", userId = " + userId +
        "}";
    }
}
