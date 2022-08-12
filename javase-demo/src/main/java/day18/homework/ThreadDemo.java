package day18.homework;

/**
 * @author Yang Song
 * @date 2022/8/11 21:09
 */
public class ThreadDemo implements Runnable {
    public String date;
    public Object o11;
    public Object o22;

    public ThreadDemo(String date, Object o1, Object o2) {
        this.date = date;
        this.o11 = o1;
        this.o22 = o2;
    }

    @Override
    public synchronized void run() {
        int count = 0;
        while (true) {
            synchronized (o11) {
                synchronized (o22) {
                    System.out.println(date);
                    count++;
                }
            }
        }
    }
}