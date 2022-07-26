package com.songyang;


import com.songyang.common.R;
import com.songyang.config.AlipayProperties;
import com.songyang.entity.Orders;
import com.songyang.mapper.OrdersMapper;
import com.songyang.service.IAlipayService;
import com.songyang.service.IOrdersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest 
{

    @Autowired
    private IOrdersService iOrdersService;
    @Autowired
    private IAlipayService iAlipayService;
    @Autowired
    private OrdersMapper ordersMapper;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
        Orders orders = ordersMapper.selectById("1573215481312075777");
        String paidAmount = orders.getPaidAmount().toString();
        String orderSubject = orders.getOrderSubject();
        String orderNum = orders.getOrderNum();
        System.out.println(orderNum);
    }
    @Test
    public void a(){
        String s  =  "{"  +
                "    \"out_trade_no\":\"20150320010101001\","  +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\","  +
                "    \"total_amount\":521.21,"  +
                "    \"subject\":\"宋洋的二手小米11 1T\" "  +
                "  }";
        System.out.println(s);
        String s1 =  "{"  +
                "    \"out_trade_no\":\""+"111"+"\","  +
                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\","  +
                "    \"total_amount\":"+"111"+","  +
                "    \"subject\":\""+"111"+"\" "+
                "    \"merchant_order_no\":\""+"111"+"\" "+
                "  }"  ;
        System.out.println(s1);
    }
    @Test
    public void testMap(){
        Map<String,String[]> map = new HashMap<>();
        String[] v1 = {"2022-09-23 19:23:50"};
        String[] v2 = {"牛奶   *2"};
        String[] v3 = {"UTF-8"};
        String[] v4 = {"[{\"amount\":\"30.00\",\"fundChannel\":\"ALIPAYACCOUNT\"}]"};
        map.put("gmt_create",v1);
        map.put("subject",v2);
        map.put("charset",v3);
        map.put("fund_bill_list",v4);
        Map<String, String> collect = map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        (entry) -> String.join(",", entry.getValue())));
        collect.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
    @Test
    public void testPublic(){
        String s1 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqdCjBCXKDqcyqLfW9bFMhC95d9pmU4AUPrPx+v++zPlkeS8CGYyV3ZdJEXiySDPkIL4x7G4iL7ycHey36t8s/rlkk+NbMlad0IR2gX6QPo03hZswOBlHSJAIEm6ccTcXfGyJBSyE0HCHnUGaKb1ZA7AY+XPE46lCxzB1crrdg/FLbp93jH2+90jVv4epenIAx1/8oo1qSI5ahmyygJGFzAz709ouidiCJ8du7qwGz8jEIRiCVfA1+YuaiPo2Bgts5jyLtHerqYN2nUPJ+Nuvk9WX3KrLgAmdQHXyu/16mA/zm2mxSnf2v4dIKGZEzMndKyHcv1QQN7K6YXxZPlywMQIDAQAB";
        String s2 = AlipayProperties.ALIPAY_PUBLIC_KEY;
        System.out.println(s1.equals(s2));
    }
    @Test
    public void testR(){
        List<Orders> list = iOrdersService.list();
        R r = R.ok().data("orderList",list);
        System.out.println(r);
    }
}
