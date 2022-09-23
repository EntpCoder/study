package com.songyang.controller;

import com.alipay.api.internal.util.AlipaySignature;
import com.songyang.entity.vo.AlipayVo;
import com.songyang.service.IAlipayService;
import com.songyang.service.IOrdersService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    @GetMapping("/goAliPay/{orderId}")
    public String goPay(@PathVariable("orderId") String orderId){
        return alipayService.goAliPay(orderId);
    }
    @PostMapping("/aliNotify")
    public void callBack1(AlipayVo alipayVo, HttpServletRequest request){
        System.out.println("阿里异步回调  修改订单状态");
        alipayService.callBack(alipayVo,request.getParameterMap());
    }
    @GetMapping("/aliReturn")
    public String callBack2(AlipayVo alipayVo,Map<String,String[]> params){

        System.out.println("阿里同步回调,跳转页面");
        return "同步请求回调 跳转页面";
    }
}
