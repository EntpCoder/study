package com.songyang.controller;

import com.songyang.common.R;
import com.songyang.entity.Orders;
import com.songyang.entity.Product;
import com.songyang.service.IOrdersService;
import com.songyang.service.IProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
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
    @GetMapping("/getOrdersByUser/{id}")
    public R getOrders(@PathVariable("id") String id){
        List<Orders> list = ordersService.list();
        return R.ok().data("userOrder",list);
    }
}
