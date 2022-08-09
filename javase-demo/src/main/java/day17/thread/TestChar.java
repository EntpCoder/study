package day17.thread;

/**
 * @author Yang Song
 * @date 2022/8/9 11:16
 */
public class TestChar {
    /**
     * 主线程
     * @param args 入参
     */
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        // 初始化线程
        CharThread charThread = new CharThread();
        // 线程开启
        charThread.start();
        NumberThread numberThread = new NumberThread();
        numberThread.start();
    }
}
