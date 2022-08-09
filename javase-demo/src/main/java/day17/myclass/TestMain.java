package day17.myclass;

/**
 * @author Yang Song
 * @date 2022/8/9 19:15
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Account song = new Account(0);
        for(int i = 0;i < 10000;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+":"+song.deposit(10));
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(song.getBalance());
    }
}
