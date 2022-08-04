package day14.examination;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Yang Song
 * @date 2022/8/4 14:58
 */
public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student(1001,"Smith","计算机",20, LocalDate.parse("2010-09-01"));
        Student s2 = new Student(1002,"Peter","计算机",20, LocalDate.parse("2011-09-01"));
        Student s3 = new Student(1003,"Allen","计算机",20, LocalDate.parse("2013-09-01"));
        Student s4 = new Student(1004,"Linda","计算机",20, LocalDate.parse("2011-09-03"));
        Student s5 = new Student(1005,"Jerry","计算机",20, LocalDate.parse("2012-09-02"));
        List<Student> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3,s4,s5);
        Collections.sort(list);
        list.forEach(System.out::println);


        TreeSet<Student> treeSet = new TreeSet<>(list);
        treeSet.forEach(System.out::println);
    }
}
