package mythread;

/**
 * @author Yang Song
 * @date 2022/11/11 10:58
 */
public class TestMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("我是线程1");
        });
        String s = "";
        StringBuilder s1 = new StringBuilder();
        thread1.run();
    }
}
