package day16.homework;

/**
 * @author Yang Song
 * @date 2022/8/8 21:13
 */
public class ProxyTest {
    public static void main(String[] args) {
        ProductService proxy = (ProductService)new MyProxy().getProxy(new ProductServiceImpl());
        proxy.delete();
        proxy.save();
        proxy.getById();
    }
}
