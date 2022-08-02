package day12.factory;


/**
 * @author Yang Song
 * @date 2022/8/2 16:17
 */
public class TestMain {
    public static void main(String[] args) {
        Phone phone1 = PhoneFactory.getPhone(PhoneType.IPHONE);
        phone1.call("旭儿子");
        Phone phone2 = PhoneFactory.getPhone(PhoneType.HUAWEI);
        phone2.takePhoto();
        Phone phone3 = PhoneFactory.getPhone(PhoneType.MI);
        phone3.takePhoto();
    }
}
