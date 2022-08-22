package org.songyang.chapter05;

/**
 * @author Yang Song
 * @date 2022/8/22 14:08
 */
public class DynamicLinkingTest {
    public void methodA(){
        System.out.println("Im methodA");
    }
    public void methodB(){
        System.out.println("Im methodB");
        methodA();
        int i = 0;
        i++;
    }
}
