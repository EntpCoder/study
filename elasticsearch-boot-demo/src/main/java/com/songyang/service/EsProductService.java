package com.songyang.service;

import com.songyang.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;


/**
 * @author Yang Song
 * @date 2022/10/25 14:38
 */
@Service
public interface EsProductService extends ElasticsearchRepository<Product,Integer> {
}
