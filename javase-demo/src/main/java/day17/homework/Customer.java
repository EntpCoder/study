package day17.homework;

/**
 * @author Yang Song
 * @date 2022/8/9 20:16
 */
public class Customer implements Runnable{
    private Restaurant restaurant;
    public Customer(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    @Override
    public void run() {
        while (true){
            restaurant.get();
        }

    }
}
