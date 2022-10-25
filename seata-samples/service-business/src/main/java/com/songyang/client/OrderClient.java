package com.songyang.client;

import com.songyang.common.entity.Order;
import com.songyang.common.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yang Song
 * @date 2022/10/18 12:08
 */
@Component
@FeignClient(name = "seata-order")
public interface OrderClient {
    /**
     * 远程调用创建订单
     * @param userId 用户id
     * @param commodityCode 商品编号
     * @param orderCount 订购数量
     * @return 订单
     */
    @RequestMapping("order/create")
    public R<Order> createOrder(@RequestParam("userId") String userId,
                                    @RequestParam("commodityCode")String commodityCode,
                                        @RequestParam("orderCount")int orderCount);
}
