package day17.thread;

/**
 * @author Yang Song
 * @date 2022/8/9 11:20
 */
public class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("数字>>>" + i);
        }
    }
}
