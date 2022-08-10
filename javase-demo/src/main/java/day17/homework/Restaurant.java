package day17.homework;

/**
 * @author Yang Song
 * @date 2022/8/9 20:14
 */
public class Restaurant {
    private int dish;

    public synchronized void put() {
        if (dish >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dish++;
        System.out.println("商家生产了一份:剩余盒饭>>>" + dish);
        this.notifyAll();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        if (dish == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dish--;
        System.out.println("客人拿了一份:剩余盒饭>>>" + dish);
        this.notifyAll();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
