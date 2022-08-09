package day17.proxy.myclass;

/**
 * @author Yang Song
 * @date 2022/8/9 18:09
 */
public class TestMain {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ProductService p = (ProductService) MyProxy.newProxy(new ProductServiceImpl());
        p.add();
    }
}
