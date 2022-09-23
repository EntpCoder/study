package com.songyang.entity.vo;

/**
 * @author Yang Song
 * @date 2022/9/23 15:31
 */
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
     * total_amount
     */
    private String total_amount;
    /**
     * 商户原始订单号
     */
    private String merchant_order_no;
    /**
     * 签名
     */
    private String sign;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getMerchant_order_no() {
        return merchant_order_no;
    }

    public void setMerchant_order_no(String merchant_order_no) {
        this.merchant_order_no = merchant_order_no;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "AlipayVo{" +
                "trade_no='" + trade_no + '\'' +
                ", out_trade_no='" + out_trade_no + '\'' +
                ", seller_id='" + seller_id + '\'' +
                ", total_amount='" + total_amount + '\'' +
                ", merchant_order_no='" + merchant_order_no + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
