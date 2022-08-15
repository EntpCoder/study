package day20.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Yang Song
 * @date 2022/8/12 19:42
 */
public class TestMain {
    public static void main(String[] args) {
        Person p1 = new Person("000001","刘德华","0000"
                ,1,"4155990188888888",
                LocalDateTime.parse("20060720200005", DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),
                BigDecimal.valueOf(500.00));
        Person p2 = new Person("000201","晓龙","0002"
                ,1,"4155990199999999",
                LocalDateTime.parse("20060720200005", DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),
                BigDecimal.valueOf(500.00));
        Person p3 = new Person("000201","刘晓明","0012"
                ,1,"4155990199999999",
                LocalDateTime.parse("20060720200005", DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),
                BigDecimal.valueOf(500.00));
        List<Person> list = new ArrayList<>();
        Collections.addAll(list,p1,p2,p3);
        Map<Character, List<Person>> collect = list.stream()
                .collect(Collectors.groupingBy((p) -> p.getName().charAt(0)));
        collect.forEach((k,v)-> System.out.println(k+":"+v));

        BigDecimal bigDecimal = list.stream()
                .map(Person::getHappenPrice)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        System.out.println(bigDecimal);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\Mr.Song\\Desktop\\employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(p1);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
