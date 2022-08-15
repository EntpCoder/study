package day20.homework;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Yang Song
 * @date 2022/8/12 19:38
 */
public class Person implements Serializable {
    private String customerNumber;
    private String name;
    private String organizationNum;
    private int gender;
    private String accountNumber;
    private LocalDateTime happenTime;
    private BigDecimal happenPrice;

    public Person(String customerNumber, String name, String organizationNum, int gender,
                  String accountNumber, LocalDateTime happenTime, BigDecimal happenPrice) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.organizationNum = organizationNum;
        this.gender = gender;
        this.accountNumber = accountNumber;
        this.happenTime = happenTime;
        this.happenPrice = happenPrice;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationNum() {
        return organizationNum;
    }

    public void setOrganizationNum(String organizationNum) {
        this.organizationNum = organizationNum;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDateTime getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(LocalDateTime happenTime) {
        this.happenTime = happenTime;
    }

    public BigDecimal getHappenPrice() {
        return happenPrice;
    }

    public void setHappenPrice(BigDecimal happenPrice) {
        this.happenPrice = happenPrice;
    }

    @Override
    public String toString() {
        return "Person{" +
                "customerNumber='" + customerNumber + '\'' +
                ", name='" + name + '\'' +
                ", organizationNum='" + organizationNum + '\'' +
                ", gender=" + gender +
                ", accountNumber='" + accountNumber + '\'' +
                ", happenTime=" + happenTime +
                ", happenPrice=" + happenPrice +
                '}';
    }
}
