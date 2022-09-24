package com.songyang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
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
}
