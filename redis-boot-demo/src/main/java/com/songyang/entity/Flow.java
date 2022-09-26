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
 * 流水表
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
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
}
