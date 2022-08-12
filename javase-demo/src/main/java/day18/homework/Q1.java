package day18.homework;

/**
 * @author Yang Song
 * @date 2022/8/11 8:59
 */
public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Thread A = new Thread(new ThreadDemo("A",c,a));
        Thread B = new Thread(new ThreadDemo("B",a,b));
        Thread C = new Thread(new ThreadDemo("C",b,c));
        A.start();
        B.start();
        C.start();
    }
}
