package day12.factory;

/**
 * @author Yang Song
 * @date 2022/8/2 16:14
 */
public class PhoneFactory{
    public static Phone getPhone(PhoneType phoneType){
        Phone phone = null;
        if(phoneType == null){
            throw new  RuntimeException("请传入手机类型");
        }
        switch (phoneType){
            case HUAWEI:
                phone = new HuaWei();
                break;
            case MI:
                phone = new XiaoMi();
                break;
            case IPHONE:
                phone = new Iphone();
                break;
            default:
        }
        return phone;
    }
}
