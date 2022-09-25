package com.songyang.controller;

import com.songyang.common.R;
import com.songyang.entity.vo.AlipayVo;
import com.songyang.service.IAlipayService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Yang Song
 * @date 2022/9/23 11:28
 */
@RestController
@CrossOrigin
public class AlipayController {
    private final IAlipayService alipayService;
    public AlipayController(IAlipayService iAlipayService){
        this.alipayService = iAlipayService;
    }

    /**
     * 根据订单id 拉起支付页面
     * @param orderId 订单id
     * @return 支付页面
     */
    @GetMapping("/goAliPay/{orderId}")
    public String goPay(@PathVariable("orderId") String orderId){
        return alipayService.goAliPay(orderId);
    }

    /**
     * 交易成功支付宝异步回调
     * @param alipayVo 支付宝异步回调参数(用于生成流水，修改订单状态)
     * @param request 支付宝回调信息请求体(用于验签)
     */
    @PostMapping("/aliNotify")
    public String callBack1(AlipayVo alipayVo, HttpServletRequest request){
        // 反馈给支付宝是否成功信息
        return alipayService.callBackAsync(alipayVo,request.getParameterMap());
    }

    /**
     * 用户付款成功支付宝同步回调
     * @param alipayVo 支付宝同步回调参数
     * @return 用户支付信息(订单号,流水号,支付金额)
     */
    @GetMapping("/aliReturn")
    public R callBack2(AlipayVo alipayVo){
        return R.ok().data("payInfo",alipayService.callBackSync(alipayVo));
    }
}
