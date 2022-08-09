package day17.thread;

/**
 * @author Yang Song
 * @date 2022/8/9 14:59
 */
public class Account {
    private int balance;
    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public synchronized int deposit(int money){
        this.balance += money;
        return balance;
    }
}
