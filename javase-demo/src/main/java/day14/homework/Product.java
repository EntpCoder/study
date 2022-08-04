package day14.homework;

/**
 * @author Yang Song
 * @date 2022/8/4 18:30
 */
public class Product {
    private String brand;
    private String name;
    private double cost;

    public Product() {
    }
    public Product(String brand, String name, double cost) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Product [brand=" + brand + ", name=" + name + ", cost=" + cost + "]";
    }


}
