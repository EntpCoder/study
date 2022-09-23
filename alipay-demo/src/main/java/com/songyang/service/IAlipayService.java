package com.songyang.service;

import com.songyang.entity.vo.AlipayVo;

import java.util.Map;

/**
 * @author Yang Song
 * @date 2022/9/23 12:21
 */
public interface IAlipayService {
    /**
     *  亚眠
     * @param orderId 的
     * @return 页面
     */
    public String goAliPay(String orderId);

    /**
     * 交易成功回调
     * @param alipayVo 回调参数
     * @param params 验签参数
     */
    public void callBack(AlipayVo alipayVo, Map<String,String[]> params);
}
