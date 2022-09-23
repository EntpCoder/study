package com.songyang.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 流水表
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
public class Flow implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 流水号
     */
    private String flowNum;

    /**
     * 订单号
     */
    private String orderNum;

    /**
     * 产品主键ID
     */
    private String productId;

    /**
     * 支付金额
     */
    private BigDecimal paidAmount;

    /**
     * 支付方式	            1：支付宝	            2：微信
     */
    private Integer paidMethod;

    /**
     * 购买个数
     */
    private Integer buyCounts;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlowNum() {
        return flowNum;
    }

    public void setFlowNum(String flowNum) {
        this.flowNum = flowNum;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Integer getPaidMethod() {
        return paidMethod;
    }

    public void setPaidMethod(Integer paidMethod) {
        this.paidMethod = paidMethod;
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

    @Override
    public String toString() {
        return "Flow{" +
            "id = " + id +
            ", flowNum = " + flowNum +
            ", orderNum = " + orderNum +
            ", productId = " + productId +
            ", paidAmount = " + paidAmount +
            ", paidMethod = " + paidMethod +
            ", buyCounts = " + buyCounts +
            ", createTime = " + createTime +
        "}";
    }
}
