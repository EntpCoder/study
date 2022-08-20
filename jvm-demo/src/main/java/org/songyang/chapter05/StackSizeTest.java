package org.songyang.chapter05;

/**
 * @author Yang Song
 * @date 2022/8/19 21:07
 */
public class StackSizeTest {
    private static int i = 1;

    public static void main(String[] args) {
        System.out.println(i);
        i++;
        main(args);
    }
}
