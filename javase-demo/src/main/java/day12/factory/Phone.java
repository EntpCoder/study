package day12.factory;

/**
 * @author Yang Song
 * @date 2022/8/2 16:06
 */
public interface Phone {
    /**
     * 打电话
     * @param linkMan 联系人
     */
    void call(String linkMan);

    /**
     * 拍照片
     */
    void takePhoto();
}
