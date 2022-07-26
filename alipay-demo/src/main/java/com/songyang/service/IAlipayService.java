package com.songyang.service;

import com.songyang.entity.vo.AlipayVo;
import com.songyang.entity.vo.PayResultVo;

import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/9/23 12:21
 */
public interface IAlipayService {
    /**
     *  拉起页面
     * @param orderId 待支付订单id
     * @return 页面
     */
     String goAliPay(String orderId);

    /**
     * 交易成功 异步回调
     * @param alipayVo 回调参数
     * @param params 验签参数
     * @return 返回给支付宝是否成功(success/failure)
     */
    String callBackAsync(AlipayVo alipayVo, Map<String,String[]> params);

    /**
     * 用户付款成功 同步回调
     * @param alipayVo 回调参数
     * @return 支付信息
     */
    PayResultVo callBackSync(AlipayVo alipayVo);
    /**
     * 验签
     * @param requestParams 请求体参数
     * @return 验签是否成功
     */
    boolean isSign(Map<String, String[]> requestParams);
}
