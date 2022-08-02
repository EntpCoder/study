package day12.homework;

import java.time.LocalDateTime;

/**
 * @author Yang Song
 * @date 2022/8/2 20:15
 */
public class Customer {
    private int customerId;
    private String customerName;
    private LocalDateTime insertTime;
    public Customer(){}
    public Customer(int customerId, String customerName, LocalDateTime insertTime) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.insertTime = insertTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", insertTime=" + insertTime +
                '}';
    }
}
