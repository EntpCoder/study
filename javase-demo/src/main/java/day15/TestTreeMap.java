package day15;

import java.util.TreeMap;

/**
 * @author Yang Song
 * @date 2022/8/5 14:04
 */
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Product,Integer> t = new TreeMap<>();
        Product p1 = new Product(902,"iphone",6500.0);
        Product p2 = new Product(901,"huawei",6000.0);
        Product p3 = new Product(901,"huawei",600.0);
        t.put(p1,1);
        t.put(p2,1);
        t.put(p3,1);
        System.out.println(t);

    }
}
