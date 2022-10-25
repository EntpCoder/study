package com.songyang.service.impl;

import com.songyang.client.OrderClient;
import com.songyang.client.StockClient;
import com.songyang.service.IBusinessService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

/**
 * @author Yang Song
 * @date 2022/10/18 12:07
 */
@Service
public class BusinessServiceImpl implements IBusinessService {
    private final OrderClient orderClient;
    private final StockClient stockClient;

    public BusinessServiceImpl(OrderClient orderClient, StockClient stockClient) {
        this.orderClient = orderClient;
        this.stockClient = stockClient;
    }
    @Override
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount) {
        stockClient.deduct(commodityCode,orderCount);
        orderClient.createOrder(userId,commodityCode,orderCount);
    }
}
