package day16.homework;

/**
 * @author Yang Song
 * @date 2022/8/8 21:13
 */
public class ProxyTest {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ProductService proxy = (ProductService)new MyProxy().getProxy(new ProductServiceImpl());
        System.out.println(proxy);
        proxy.delete();
        proxy.save();
        proxy.getById();
        int i = proxy.hashCode();
        System.out.println(i);
    }
}
