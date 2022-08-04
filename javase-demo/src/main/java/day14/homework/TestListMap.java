package day14.homework;

import java.util.*;
import java.util.stream.Collectors;
/**
 * @author Yang Song
 * @date 2022/8/4 18:10
 */
public class TestListMap {
    public static void main(String[] args) {
        Product p1 = new Product("宝洁","洗手粉",18.5);
        Product p2 = new Product("联合利华","肥皂",4.5);
        Product p3 = new Product("宝洁","牙膏",32.5);
        Product p4 = new Product("宝洁","毛巾",14.5);
        Product p5 = new Product("洁利","洗面奶",26.0);
        Product p6 = new Product("好迪","洗发水",27.5);
        Product p7 = new Product("多芬","沐浴露",38.5);
        Product p8 = new Product("宝洁","洗洁精",3.4);
        List<Product> list = new ArrayList<>();
        Collections.addAll(list,p1,p2,p3,p4,p5,p6,p7,p8);
        List<Map.Entry<String, Double>> collect = list.stream()
                .collect(Collectors.groupingBy(Product::getBrand, Collectors.summingDouble(Product::getCost)))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getValue() > o2.getValue() ? -1 : 1)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
