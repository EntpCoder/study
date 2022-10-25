package com;

import com.songyang.ElasticSearchApplication;
import com.songyang.entity.Product;
import com.songyang.service.EsProductService;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/10/25 14:41
 */
@SpringBootTest(classes = ElasticSearchApplication.class)
public class MyTest {
    @Autowired
    private EsProductService esProductService;
    @Autowired
    private ElasticsearchRestTemplate esRestTemplate;

    @Test
    public void testEs1() {
        System.out.println(esProductService.findById(2));
    }

    @Test
    public void testEs2() {
        Pageable pageable= PageRequest.of(0,1);
        String serach = "针织连衣裙";
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery()
                .should(QueryBuilders.matchQuery("proName", serach));
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(boolQueryBuilder)
                .withPageable(pageable)
                .withHighlightFields(new HighlightBuilder.Field("proName"))
                .withHighlightBuilder(
                        new HighlightBuilder()
                                .preTags("<span style='color:yellow'>")
                                .postTags("</span>")).build();
        SearchHits<Product> searchHits = esRestTemplate.search(searchQuery, Product.class);
        System.out.println(searchHits);
        List<SearchHit<Product>> hits = searchHits.getSearchHits();
        List<Product> products = new ArrayList<>();
        for (SearchHit<Product> hit:
             hits) {
            Product content = hit.getContent();
            Product p = new Product();
            System.out.println(content);
            BeanUtils.copyProperties(content,p);
            String proName = hit.getHighlightField("proName").get(0);
            p.setProName(proName);
            products.add(p);
        }
        System.out.println(products);
    }
}
