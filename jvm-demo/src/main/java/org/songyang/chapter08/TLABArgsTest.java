package org.songyang.chapter08;

/**
 * 测试 -XX:UseTLAB参数开启情况 默认开启
 * @author Yang Song
 * @date 2022/9/1 14:42
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("bye world");
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
