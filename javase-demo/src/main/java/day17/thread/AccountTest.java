package day17.thread;


import java.util.concurrent.locks.Lock;

/**
 * @author Yang Song
 * @date 2022/8/9 15:00
 */
public class AccountTest {
    public static void main(String[] args) {
        new AccountTest().test();
    }
    public synchronized void test(){
        Account a = new Account(0);
        for(int i = 0;i < 100000;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"余额:"+a.deposit(10));
            }).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("操作完毕最终余额:"+a.getBalance()+"===============================");
    }
}
