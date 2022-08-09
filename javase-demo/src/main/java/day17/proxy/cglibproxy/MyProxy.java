package day17.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author Yang Song
 * @date 2022/8/9 13:42
 */
public class MyProxy {
    public static Object newProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MyMethodInterceptor(target));
        return enhancer.create();
    }
}
