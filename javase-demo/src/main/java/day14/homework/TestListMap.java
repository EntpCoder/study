package day14.homework;

import java.util.*;
import java.util.stream.Collectors;
/**
 * @author Yang Song
 * @date 2022/8/4 18:10
 */
public class TestListMap {
    public static void main(String[] args) {
        Product product1 = new Product("小米","小米手机11",5000);
        Product product2 = new Product("华为","华为手机P30",6000);
        Product product3 = new Product("苹果","苹果手机X",8000);
        Product product4 = new Product("小米","小米手机11Ultra",6666);
        Product product5 = new Product("小米","小米手机12",6000);
        Product product6 = new Product("苹果","苹果手11MaxPro",12000);
        Product product7 = new Product("华为","华为手机P40",9200);
        List<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.stream()
                .collect(Collectors.groupingBy(Product::getBrand, Collectors.summingDouble(Product::getCost)))
                .forEach((k,v)-> System.out.println(k+"-"+v+"元"));
    }
}
