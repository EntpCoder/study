package com.songyang.service;

/**
 * @author Yang Song
 * @date 2022/10/18 12:06
 */
public interface IBusinessService {
    /**
     * 用户订购商品
     *
     * @param userId        用户ID
     * @param commodityCode 商品编号
     * @param orderCount    订购数量
     */
    void purchase(String userId, String commodityCode, int orderCount);
}
