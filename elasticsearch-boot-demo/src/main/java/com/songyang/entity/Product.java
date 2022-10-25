package com.songyang.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author Yang Song
 * @date 2022/10/25 14:20
 */
@Data
@Document(indexName = "yiran")
public class Product {
    @Id
    private Integer id;
    @Field(type = FieldType.Keyword)
    private String proId;
    @Field(type = FieldType.Text,analyzer = "ik_smart",searchAnalyzer = "ik_max_word")
    private String proName;
    @Field(type = FieldType.Text,analyzer = "ik_smart",searchAnalyzer = "ik_max_word")
    private String describe;
    @Field(type = FieldType.Keyword)
    private String imgUrl;
    @Field(type = FieldType.Double)
    private Double sellingPrice;
    @Field(type = FieldType.Double)
    private Double discount;
}
