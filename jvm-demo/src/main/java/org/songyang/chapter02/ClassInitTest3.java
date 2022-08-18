package org.songyang.chapter02;

/**
 * @author Yang Song
 * @date 2022/8/18 10:04
 */
public class ClassInitTest3 {
    static class Father{
        public static int A = 1;
        static {
            A = 2;
        }
    }
    static class Son extends Father{
        public static int B = A;
    }
    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
