package day12.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yang Song
 * @date 2022/8/2 20:29
 */
public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(123,"smith", LocalDateTime.now());
        Customer c2 = new Customer(124,"tom", LocalDateTime.now());
        MyOrder order1 = new MyOrder(1,1,900f,LocalDateTime.parse("2022-02-18T15:22:33"),c1);
        MyOrder order2 = new MyOrder(2,2,600f,LocalDateTime.now(),c1);
        MyOrder order3 = new MyOrder(3,3,400f,LocalDateTime.parse("2022-03-25T12:00:20"),c1);
        MyOrder order4 = new MyOrder(4,4,88.88f,LocalDateTime.now(),c2);
        List<MyOrder> orderList = new ArrayList<>();
        Collections.addAll(orderList,order1,order2,order3,order4);
        double sum = orderList.stream()
                .filter(m -> "smith".equals(m.getCustomer().getCustomerName()))
                .mapToDouble(MyOrder::getOrderPrice)
                .sum();
        System.out.println("smith订单总和为:"+sum);
        System.out.println("2022-5-1之前的订单信息有:");
        orderList.stream()
                .filter(m -> m.getCreatDateTime().toLocalDate().isBefore(LocalDate.parse("2022-05-01")))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
