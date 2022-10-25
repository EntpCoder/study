package com.songyang.service.impl;

import com.songyang.entity.Product;
import com.songyang.service.IProductService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/10/25 15:39
 */
@Service
public class ProductServiceImpl implements IProductService {
    private final ElasticsearchRestTemplate esRestTemplate;

    public ProductServiceImpl(ElasticsearchRestTemplate esRestTemplate) {
        this.esRestTemplate = esRestTemplate;
    }
    @Override
    public List<Product> searchHighByProName(String productName, Integer pageNum) {
        if(pageNum == null || pageNum <= 0){
            pageNum = 1;
        }
        Pageable pageable= PageRequest.of(pageNum-1,9);
        // 构建查询的字段
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery()
                .should(QueryBuilders.matchQuery("proName", productName));
        // 构建查询(查询字段、分页、高亮字段、构建高亮规则)
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(boolQueryBuilder)
                .withPageable(pageable)
                .withHighlightFields(new HighlightBuilder.Field("proName"))
                .withHighlightBuilder(
                        new HighlightBuilder()
                                .preTags("<span style='color:skyblue'>")
                                .postTags("</span>")).build();
        // 发送查询请求(查询结果集)
        SearchHits<Product> searchHits = esRestTemplate.search(searchQuery, Product.class);
        // 命中的对象集合
        List<SearchHit<Product>> hits = searchHits.getSearchHits();
        // 准备结果集对象
        List<Product> products = new ArrayList<>();
        for (SearchHit<Product> hit:
                hits) {
            // 命中的数据对象
            Product product= hit.getContent();
            // 获取商品名称(高亮效果的proName)
            String proName = hit.getHighlightField("proName").get(0);
            // 将商品名称替换为高亮
            product.setProName(proName);
            products.add(product);
        }
        return products;
    }
}
