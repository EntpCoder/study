package com.songyang.service;

import com.songyang.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单表 服务类
 * </p>
 * @author Yang Song
 * @since 2022-09-23
 */
public interface IOrdersService extends IService<Orders> {
    /**
     * 创建订单
     * @param productId 商品id
     * @param productNum 商品数量
     * @param userId 用户id
     * @return 是否成功
     */
    public Orders createOrder(String productId, Integer productNum,String userId);

    /**
     * 修改订单状态为支付状态
     * @param orderId 订单
     * @return 是否成功
     */
    public boolean payOrder(String orderId);
}
