package day17.thread;

/**
 * @author Yang Song
 * @date 2022/8/9 11:14
 */
public class CharThread extends Thread {
    /**
     * 该线程的核心业务
     */
    @Override
    public void run() {
        char c = 'a';
        for (int i = 0; i < 10000; i++) {
            System.out.println("字母>>>" + c);
            c++;
            if (c > 'z') {
                c = 'a';
            }
        }
    }
}
