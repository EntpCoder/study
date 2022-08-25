package org.songyang.chapter08;

/**
 * @author Yang Song
 * @date 2022/8/23 20:51
 */
public class HeapDemo2 {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
