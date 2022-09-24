package com.songyang.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 接收支付宝回调实体类
 * @author Yang Song
 * @date 2022/9/23 15:31
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AlipayVo {
    /**
     * 支付宝交易号
     */
    private String trade_no;
    /**
     * 订单号
     */
    private String out_trade_no;
    /**
     *收款支付宝账号对应的支付宝唯一用户号。
     * 以2088开头的纯16位数字
     */
    private String seller_id;
    /**
     * 订单金额
     */
    private String total_amount;
    /**
     * 原始订单号(orderNum)非orderId
     */
    private String merchant_order_no;
    /**
     * 支付宝回传自定义参数
     */
    private String passback_params;
    /**
     * 签名
     */
    private String sign;
}
