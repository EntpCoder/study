package day17.proxy.myclass;

import java.lang.reflect.Method;

/**
 * @author Yang Song
 * @date 2022/8/9 18:12
 */
public class ProductServiceImplPro implements ProductService{
    private static  Method m1;
    private static  Method m2;
    static {
        try {
            m1 = Class.forName("day17.proxy.myclass.ProductServiceImpl").getMethod("add");
            m2 = Class.forName("day17.proxy.myclass.ProductServiceImpl").getMethod("delete");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private ProductServiceImpl p;
    private IInvocationHandler h;
    public ProductServiceImplPro(ProductServiceImpl p){
        this.p = p;
    }
    @Override
    public void add() {
        h.zhiXing(m1,null);
    }

    @Override
    public void delete() {
        h.zhiXing(m2,null);
    }
}
