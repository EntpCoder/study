package com.songyang.controller;

import com.songyang.common.R;
import com.songyang.entity.Orders;
import com.songyang.entity.Product;
import com.songyang.service.IOrdersService;
import com.songyang.service.IProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final IOrdersService ordersService;
    public OrdersController(IOrdersService iOrdersService){
        this.ordersService = iOrdersService;
    }
    @PostMapping("/createOrder")
    public R createOrder(String productId,Integer productNum,String userId){
        Orders order = ordersService.createOrder(productId, productNum,userId);
        return R.ok().data("order",order);
    }
}
