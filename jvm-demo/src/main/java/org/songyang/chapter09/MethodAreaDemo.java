package org.songyang.chapter09;

/**
 * 测试设置方法区大小参数的默认值
 * jdk1.8之后
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 * @author Yang Song
 * @date 2022/9/13 9:55
 */
public class MethodAreaDemo {
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
