package day17.thread;

import java.util.Scanner;

/**
 * @author Yang Song
 * @date 2022/8/9 13:54
 */
public class TestOddEven {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 1;i < 50;i += 2){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"奇数线程");
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 50;i += 2){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"偶数线程");
        t1.start();
        t2.start();
        for(int i = 0;i < 50;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
