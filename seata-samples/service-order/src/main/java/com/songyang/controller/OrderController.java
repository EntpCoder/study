package com.songyang.controller;

import com.songyang.common.entity.Order;
import com.songyang.common.result.R;
import com.songyang.service.IOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/18 11:26
 */
@RestController
public class OrderController {
    private final IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }
    @RequestMapping("order/create")
    public R<Order> createOrder(String userId, String commodityCode, int orderCount){
        Order order = orderService.create(userId, commodityCode, orderCount);
        return R.ok("order",order);
    }
}
