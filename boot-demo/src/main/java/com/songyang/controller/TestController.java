package com.songyang.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.songyang.entity.CouponStock;
import com.songyang.entity.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

/**
 * @author Yang Song
 * @date 2022/9/20 9:38
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test")
    public String test(){
        ResultVo<CouponStock> stockResultVo = new ResultVo<>();
        CouponStock couponStock = new CouponStock();
        couponStock.setCouponNo("111111");
        stockResultVo.setData(couponStock);
        return "111";
    }
}
