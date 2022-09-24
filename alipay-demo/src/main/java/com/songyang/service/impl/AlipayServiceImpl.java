package com.songyang.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.songyang.config.AlipayConfig;
import com.songyang.entity.Flow;
import com.songyang.entity.Orders;
import com.songyang.entity.vo.AlipayVo;
import com.songyang.entity.vo.PayResultVo;
import com.songyang.mapper.FlowMapper;
import com.songyang.mapper.OrdersMapper;
import com.songyang.service.IAlipayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Yang Song
 * @date 2022/9/23 12:22
 */
@Service
public class AlipayServiceImpl implements IAlipayService {
    private static final Logger log = LoggerFactory.getLogger(AlipayServiceImpl.class);
    private final OrdersMapper ordersMapper;
    private final FlowMapper flowMapper;

    public AlipayServiceImpl(OrdersMapper ordersMapper, FlowMapper flowMapper) {
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
                AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGN_TYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setReturnUrl(AlipayConfig.return_url);
        request.setNotifyUrl(AlipayConfig.notify_url);
        JSONObject bizContent = new JSONObject();
        // 必选四项参数 --其他参数参考官方文档
        bizContent.put("out_trade_no",orderId);
        bizContent.put("total_amount",paidAmount);
        bizContent.put("subject",orderSubject);
        bizContent.put("product_code","FAST_INSTANT_TRADE_PAY");
        request.setBizContent(bizContent.toString());
        String form = "";
        try {
            form = client.pageExecute(request).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return form;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void callBackAsync(AlipayVo alipayVo, Map<String, String[]> params) {
        if(isSign(params)){
            String orderId = alipayVo.getOut_trade_no();
            // 修改订单状态
            Orders orders = new Orders();
            orders.setId(orderId);
            orders.setOrderStatus("已支付");
            orders.setPaidTime(LocalDateTime.now());
            ordersMapper.updateById(orders);
            // 查询订单信息
            orders = ordersMapper.selectById(orderId);
            // 生成流水
            Flow flow = new Flow();
            flow.setFlowNum(alipayVo.getTrade_no());
            flow.setOrderNum(orders.getOrderNum());
            flow.setProductId(orders.getProductId());
            flow.setPaidAmount(orders.getPaidAmount());
            flow.setPaidMethod(1);
            flow.setBuyCounts(orders.getBuyCounts());
            flow.setCreateTime(LocalDateTime.now());
            flowMapper.insert(flow);
            log.info("[交易成功]:订单Id:"+orderId+"--流水Id:"+flow.getId());
        }else {
            log.info("[验签失败]:订单Id"+alipayVo.getOut_trade_no());
        }
    }
    @Override
    public PayResultVo callBackSync(AlipayVo alipayVo){
        // 真实环境中可以通过merchant_order_no字段传入原始订单编号，同步回调会带回这个参数
        // 由于沙箱环境接口较老导致merchant_order_no字段缺失，所以需要拿id查一下订单编号
        // 根据订单id查询订单编号用于封装用户支付信息
        String orderId = alipayVo.getOut_trade_no();
        QueryWrapper<Orders> wrapper = new QueryWrapper<>();
        wrapper.select("order_num").eq("id",orderId);
        Orders orders = ordersMapper.selectOne(wrapper);
        // 封装支付信息
        PayResultVo payResultVo = new PayResultVo();
        payResultVo.setFlowNum(alipayVo.getTrade_no());
        payResultVo.setOrderNum(orders.getOrderNum());
        payResultVo.setPaidAmount(alipayVo.getTotal_amount());
        return payResultVo;
    }
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
            signVerified = AlipaySignature.verifyV1(params, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET, AlipayConfig.SIGN_TYPE);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return signVerified;
    }
}
