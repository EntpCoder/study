package day12.factory;

/**
 * @author Yang Song
 * @date 2022/8/2 16:11
 */
public class Iphone implements Phone {
    @Override
    public void call(String linkMan) {
        System.out.println("Iphone正在给"+linkMan+"打电话");
    }

    @Override
    public void takePhoto() {
        System.out.println("Iphone拍照片咯!");
    }
}
