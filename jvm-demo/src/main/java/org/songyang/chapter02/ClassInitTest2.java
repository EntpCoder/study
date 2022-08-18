package org.songyang.chapter02;

/**
 * @author Yang Song
 * @date 2022/8/18 9:46
 */
public class ClassInitTest2 {
    public int a;
    public ClassInitTest2() {
        a = 426;
    }
    public static void main(String[] args) {
        System.out.println(new ClassInitTest2().a);
    }
}
