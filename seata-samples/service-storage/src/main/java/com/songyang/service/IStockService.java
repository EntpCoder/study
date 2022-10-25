package com.songyang.service;

/**
 * @author Yang Song
 * @date 2022/10/18 11:48
 */
public interface IStockService {
    /**
     * 扣减库存
     *
     * @param commodityCode 商品编号
     * @param count         扣减数量
     */
    void deduct(String commodityCode, int count);

    /**
     * 批量扣减
     * @param commodityCode 商品编号
     * @param count 扣减数量
     */
    void batchDeduct(String commodityCode, int count);
}
