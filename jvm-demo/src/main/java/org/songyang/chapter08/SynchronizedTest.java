package org.songyang.chapter08;

/**
 * @author Yang Song
 * @date 2022/9/9 14:54
 */
public class SynchronizedTest {
    public void f() {
        Object o = new Object();
        synchronized (o){
            System.out.println(o);
        }
    }
}
