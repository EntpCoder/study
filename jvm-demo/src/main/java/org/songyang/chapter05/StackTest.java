package org.songyang.chapter05;

/**
 * @author Yang Song
 * @date 2022/8/19 20:00
 */
public class StackTest {
    public void methodA(){
        int i = 10;
        int j = 20;
        methodB();
    }
    public void methodB(){
        int k = 30;
        int m = 40;
    }

    public static void main(String[] args) {
        StackTest test = new StackTest();
        test.methodA();
    }
}
