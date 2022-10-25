package com.songyang.service.impl;

import com.songyang.client.AccountClient;
import com.songyang.common.entity.Order;
import com.songyang.mapper.OrderMapper;
import com.songyang.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @author Yang Song
 * @date 2022/10/18 11:05
 */
@Service
public class OrderServiceImpl implements IOrderService {
    private final OrderMapper orderMapper;
    private final AccountClient accountClient;

    public OrderServiceImpl(OrderMapper orderMapper, AccountClient accountClient) {
        this.orderMapper = orderMapper;
        this.accountClient = accountClient;
    }

    @Override
    public Order create(String userId, String commodityCode, int orderCount) {
        // 计算订单金额
        int orderMoney = calculate(commodityCode, orderCount);
        // 从余额扣款
        accountClient.debit(userId,orderMoney);
        int i = 1 / 0;
        // 创建订单
        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(orderCount);
        order.setMoney(orderMoney);
        orderMapper.insert(order);
        return order;
    }
    private int calculate(String commodityId, int orderCount) {
        return 200 * orderCount;
    }
}
