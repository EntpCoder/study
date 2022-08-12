package day19.homework;

import java.time.LocalDate;

/**
 * @author Yang Song
 * @date 2022/8/11 20:23
 */
public class Product {
    private int pid;
    private String productName;
    private double price;
    private String placeOfOrigin;
    private LocalDate dateInProduced;
    public Product(){}

    public Product(int pid, String productName, double price, String placeOfOrigin, LocalDate dateInProduced) {
        this.pid = pid;
        this.productName = productName;
        this.price = price;
        this.placeOfOrigin = placeOfOrigin;
        this.dateInProduced = dateInProduced;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public LocalDate getDateInProduced() {
        return dateInProduced;
    }

    public void setDateInProduced(LocalDate dateInProduced) {
        this.dateInProduced = dateInProduced;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", placeOfOrigin='" + placeOfOrigin + '\'' +
                ", dateInProduced=" + dateInProduced +
                '}';
    }
}
