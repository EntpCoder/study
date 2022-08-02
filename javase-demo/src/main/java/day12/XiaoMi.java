package day12;

/**
 * @author Yang Song
 * @date 2022/8/2 16:13
 */
public class XiaoMi implements Phone{
    @Override
    public void call(String linkMan) {
        System.out.println("小米正在给"+linkMan+"打电话");
    }

    @Override
    public void takePhoto() {
        System.out.println("小米拍照片咯!");
    }
}
