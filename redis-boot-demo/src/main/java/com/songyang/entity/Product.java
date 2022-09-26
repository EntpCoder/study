package com.songyang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 产品表 
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;
}
