package com.songyang.service.impl;

import com.songyang.entity.Flow;
import com.songyang.entity.Orders;
import com.songyang.entity.Product;
import com.songyang.mapper.FlowMapper;
import com.songyang.mapper.OrdersMapper;
import com.songyang.mapper.ProductMapper;
import com.songyang.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {
    private final ProductMapper productMapper;
    public OrdersServiceImpl(ProductMapper productMapper){
        this.productMapper = productMapper;
    }
    @Override
    public Orders createOrder(String productId, Integer productNum,String userId) {
        Product product = productMapper.selectById(productId);
        BigDecimal productPrice = product.getPrice();
        BigDecimal orderPrice = productPrice.multiply(new BigDecimal(productNum));
        Orders orders = new Orders();
        orders.setOrderNum(UUID.randomUUID().toString().replaceAll("-",""));
        orders.setOrderStatus("未支付");
        orders.setBuyCounts(productNum);
        orders.setPaidAmount(orderPrice);
        orders.setOrderAmount(orderPrice);
        orders.setCreateTime(LocalDateTime.now());
        orders.setProductId(productId);
        String orderSubject = product.getName()+"*"+productNum;
        orders.setOrderSubject(orderSubject);
        orders.setUserId(userId);
        save(orders);
        return orders;
    }

    @Override
    public boolean payOrder(String orderId) {
        //修改订单状态
        Orders orders = new Orders();
        orders.setId(orderId);
        orders.setPaidTime(LocalDateTime.now());
        orders.setOrderStatus("已支付");
        return updateById(orders);
    }
}
