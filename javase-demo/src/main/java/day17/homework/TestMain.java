package day17.homework;

/**
 * @author Yang Song
 * @date 2022/8/9 20:22
 */
public class TestMain {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        Producer p = new Producer(r);
        Customer c = new Customer(r);
        new Thread(p).start();
        new Thread(c).start();
    }
}
