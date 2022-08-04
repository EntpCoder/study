package day14.examination;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Yang Song
 * @date 2022/8/4 14:56
 */
public class Student implements Comparable<Student>{
    private int stuNo;
    private String name;
    private String career;
    private int age;
    private LocalDate enrollmentDate;

    @Override
    public int compareTo(Student o) {
        return this.enrollmentDate.isBefore(o. enrollmentDate)?-1:1;
    }

    public Student(int stuNo, String name, String career, int age, LocalDate enrollmentDate) {
        this.stuNo = stuNo;
        this.name = name;
        this.career = career;
        this.age = age;
        this.enrollmentDate = enrollmentDate;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuNo == student.stuNo && age == student.age && Objects.equals(name, student.name) && Objects.equals(career, student.career) && Objects.equals(enrollmentDate, student.enrollmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNo, name, career, age, enrollmentDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", name='" + name + '\'' +
                ", career='" + career + '\'' +
                ", age=" + age +
                ", enrollmentDate=" + enrollmentDate +
                '}';
    }
}
