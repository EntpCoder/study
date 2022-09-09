package org.songyang.chapter08;

/**
 * 栈上分配测试
 * -Xmx128m -Xms128m -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * @author Yang Song
 * @date 2022/9/9 14:24
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        // 查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (end - start) + " ms");
        // 为了方便查看堆内存中对象个数，线程sleep
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e1) {
//            e1.printStackTrace();
//        }
    }
    private static void alloc() {
        //未发生逃逸
        User user = new User();
    }

    static class User {

    }
}
