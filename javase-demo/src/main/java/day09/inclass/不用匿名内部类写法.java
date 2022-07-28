package day09.inclass;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author Yang Song
 * @date 2022/7/28 20:33
 */
public class 不用匿名内部类写法 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "宋洋";
        s1.high = 160;
        s1.age = 22;
        Student s2 = new Student();
        s2.name = "李洋";
        s2.high = 120;
        s2.age = 23;
        MyCompare myCompare = new MyCompareImpl();
        Student big = (Student) MyUtil.compareTest(s1,s2,myCompare);
        System.out.println(big);
    }
}
