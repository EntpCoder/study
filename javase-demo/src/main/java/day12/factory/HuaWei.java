package day12.factory;

/**
 * @author Yang Song
 * @date 2022/8/2 16:14
 */
public class HuaWei implements Phone{
    @Override
    public void call(String linkMan) {
        System.out.println("华为正在给"+linkMan+"打电话");
    }

    @Override
    public void takePhoto() {
        System.out.println("华为拍照片咯!");
    }
}
