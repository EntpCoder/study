package org.songyang.chapter02;

/**
 * @author Yang Song
 * @date 2022/8/18 16:18
 */
public class ClassLoaderTest3 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式一: 通过Class获取指定类的ClassLoader
        ClassLoader classLoader1 = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader1);
        // 方式二: 获取当前线程上下文的ClassLoader
        ClassLoader classLoader2 = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader2);
        // 方式三: 获取系统的ClassLoader
        ClassLoader classLoader3 = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader3);
    }
}
