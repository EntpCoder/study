package day16;


import day16.homework.ProductServiceImpl;
import day16.homework.MyProxy;

/**
 * @author Yang Song
 * @date 2022/8/8 11:06
 */
public class WriterDemo {
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Object proxy = new MyProxy().getProxy(new ProductServiceImpl());
        System.out.println(proxy);
    }
}
