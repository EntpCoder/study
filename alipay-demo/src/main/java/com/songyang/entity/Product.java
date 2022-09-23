package com.songyang.entity;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id = " + id +
            ", name = " + name +
            ", price = " + price +
        "}";
    }
}
