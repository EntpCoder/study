package org.songyang.chapter08;

/**
 * @author Yang Song
 * @date 2022/8/30 20:26
 * -Xms600m -Xmx600m
 * -XX:NewRatio  设置老年代和新生代的比例 默认值2  老年代2/3 新生代 1/3
 * -XX:SurvivorRatio 设置Eden s0 s1 的比例 默认值8  8:1:1(官方声明)  实际默认6:1:1
 * -Xmn 设置新生代最大内存大小(一般显式通过-XX:NewRatio设置比例就行)冲突时以谁为准
 *
 * -XX:-UseAdaptiveSizePolicy 关闭自适应内存分配策略
 * -XX:+UseAdaptiveSizePolicy 开启自适应内存分配策略
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("bey world");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
