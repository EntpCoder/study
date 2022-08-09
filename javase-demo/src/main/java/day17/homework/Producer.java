package day17.homework;

/**
 * @author Yang Song
 * @date 2022/8/9 20:16
 */
public class Producer implements Runnable{
    private Restaurant restaurant;
    public Producer(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    @Override
    public void run() {
        while (true){
            restaurant.put();
        }

    }
}
