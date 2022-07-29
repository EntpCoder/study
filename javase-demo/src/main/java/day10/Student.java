package day10;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Yang Song
 * @date 2022/7/29 18:13
 */
public class Student {
    private int no;
    private String name;
    private int age;
    public Student(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(no, name, age);
    }
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
