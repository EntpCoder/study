package com.songyang.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.songyang.config.AlipayConfig;
import com.songyang.entity.Orders;
import com.songyang.entity.vo.AlipayVo;
import com.songyang.mapper.FlowMapper;
import com.songyang.mapper.OrdersMapper;
import com.songyang.service.IAlipayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Yang Song
 * @date 2022/9/23 12:22
 */
@Service
public class AlipayServiceImpl implements IAlipayService {
    private static final Logger log = LoggerFactory.getLogger(AlipayServiceImpl.class);
    private final OrdersMapper ordersMapper;
    private final FlowMapper flowMapper;

    private AlipayServiceImpl(OrdersMapper ordersMapper, FlowMapper flowMapper) {
        this.ordersMapper = ordersMapper;
        this.flowMapper = flowMapper;
    }

    @Override
    public String goAliPay(String orderId) {
        // 获取订单信息
        Orders orders = ordersMapper.selectById(orderId);
        String paidAmount = orders.getPaidAmount().toString();
        String orderSubject = orders.getOrderSubject();
        String orderNum = orders.getOrderNum();
        // 发起支付请求
        DefaultAlipayClient client = new DefaultAlipayClient(AlipayConfig.URL,
                AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT,
                AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setReturnUrl(AlipayConfig.return_url);
        request.setNotifyUrl(AlipayConfig.notify_url);
        String bizContent = "{" +
                "    \"out_trade_no\":\"" + orderId + "\"," +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                "    \"total_amount\":" + paidAmount + "," +
                "    \"subject\":\"" + orderSubject + "\"," +
                "    \"merchant_order_no\":\"" + orderNum + "\" " +
                "  }";
        request.setBizContent(bizContent);
        String form = "";
        try {
            form = client.pageExecute(request).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return form;
    }

    @Override
    public void callBack(AlipayVo alipayVo, Map<String, String[]> params) {
        boolean sign = isSign(params);
        System.out.println("验签结果");
        System.out.println(sign);
        System.out.println("回调业务逻辑");
    }

    /**
     * 验签方法
     * @param requestParams 请求体参数
     * @return 验签是否成功
     */
    public boolean isSign(Map<String, String[]> requestParams) {
        boolean signVerified = false;
        Map<String, String> params = new HashMap<>(16);
        try {
            for (String name : requestParams.keySet()) {
                String[] values = requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                params.put(name, valueStr);
            }
            signVerified = AlipaySignature.verifyV1(params, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET, AlipayConfig.SIGNTYPE);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return signVerified;
    }
}
