package day19.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Yang Song
 * @date 2022/8/11 20:28
 */
public class TestMain {
    public static void main(String[] args) {
        Product p1 = new Product(1,"火腿肠",200.0,"哈尔滨", LocalDate.parse("2022-06-14"));
        Product p2 = new Product(2,"方便面",200.0,"苏州", LocalDate.parse("2022-06-24"));
        Product p3 = new Product(3,"烤鱼片",500,"苏州", LocalDate.parse("2022-05-19"));
        Product p4 = new Product(4,"啤酒",500,"北京", LocalDate.parse("2022-05-19"));
        Product p5 = new Product(5,"花生",10,"上海", LocalDate.parse("2022-04-15"));
        Product p6 = new Product(6,"矿泉水",1,"上海", LocalDate.parse("2001-03-01"));
        List<Product> listP = new ArrayList<>();
        // （1）添加若干个商品对象
        Collections.addAll(listP,p1,p2,p3,p4,p5,p6);
        // （2）获取第3个商品对象
        Product product = listP.get(2);
        System.out.println(product);
        // （3）删除第2个商品对象
        listP.remove(1);
        // （4）将第3个商品对象的价格改为原来的1.5倍
        product.setPrice(product.getPrice()*1.5);
        //（5）迭代器遍历该集合中的所有商品对象         略
        //（6）使用foreach遍历该集合中的所有商品对象    略
        //（7）找出价格超过300的商品，将这些商品放置另一个集合ArrayList中
        List<Product> gtPrice300 = listP.stream()
                .filter(p -> p.getPrice() > 300.0)
                .collect(Collectors.toList());
        gtPrice300.forEach(System.out::println);
        // （8）统计出个产地商品的数量（如 "苏州"-5, "上海"-10,"杭州"-6）
        Map<String, Long> numForPlace = listP.stream()
                .collect(Collectors.groupingBy(Product::getPlaceOfOrigin,Collectors.counting()));
        numForPlace.forEach((k,v)-> System.out.println(k+":"+v));
        // （9） 找出生产日期在"2009-10-1"前的商品，放置另一个集合ArrayList中
        List<Product> isBefore = listP.stream()
                .filter(p -> p.getDateInProduced().isBefore(LocalDate.parse("2009-10-01")))
                .collect(Collectors.toList());
        isBefore.forEach(System.out::println);

    }
}
