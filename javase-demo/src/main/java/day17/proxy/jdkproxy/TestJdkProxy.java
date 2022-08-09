package day17.proxy.jdkproxy;

/**
 * @author Yang Song
 * @date 2022/8/9 10:42
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ProductService p = (ProductService) MyProxy.newProxy(new ProductServiceImpl());
        p.delete();
        p.save();
    }
}
