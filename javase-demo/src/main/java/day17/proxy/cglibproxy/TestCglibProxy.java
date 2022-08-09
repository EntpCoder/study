package day17.proxy.cglibproxy;

/**
 * @author Yang Song
 * @date 2022/8/9 13:50
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        ProductServiceImpl p = (ProductServiceImpl)MyProxy.newProxy(new ProductServiceImpl());
        p.delete();
    }
}
