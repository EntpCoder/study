package day15;

import java.util.Objects;

/**
 * @author Yang Song
 * @date 2022/8/5 14:11
 */
public class Product implements Comparable<Product> {
    private Integer id;
    private String name;
    private Double price;
    @Override
    public int compareTo(Product o) {
        if(Objects.equals(this,o)){
            return 0;
        }
        if(this.id > o.id && this.name.compareTo(o.name) > 0 || this.price > o.price){
            return 1;
        }else {
           return -1;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
