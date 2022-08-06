package day15.homework;

import com.alibaba.excel.annotation.ExcelProperty;
import day15.homework.converter.ExcelConverter;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 * @author Yang Song
 * @date 2022/8/5 20:12
 */
public class Student {
    @ExcelProperty("学号")
    private int stuNo;
    @ExcelProperty("姓名")
    private String stuName;
    @ExcelProperty("性别")
    private String stuGender;
    @ExcelProperty("专业")
    private String stuMajor;
    @ExcelProperty(value = "生日",converter = ExcelConverter.class)
    private LocalDate stuBirthday;

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public LocalDate getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(LocalDate stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuMajor='" + stuMajor + '\'' +
                ", stuBirthday='" + stuBirthday + '\'' +
                '}';
    }
}
