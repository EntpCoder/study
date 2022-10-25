package com.songyang.service;

import com.songyang.entity.Product;

import java.util.List;

/**
 * @author Yang Song
 * @date 2022/10/25 15:39
 */
public interface IProductService {
    /**
     * 根据商品名查询商品并高亮显示命中词
     * @param productName 商品名称
     * @param pageNum 页码
     * @return 商品集合
     */
    List<Product> searchHighByProName(String productName,Integer pageNum);
}
