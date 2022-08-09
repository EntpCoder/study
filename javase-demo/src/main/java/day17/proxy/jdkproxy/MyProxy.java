package day17.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author Yang Song
 * @date 2022/8/9 10:42
 */
public class MyProxy {
    public static Object newProxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvocationHandler(target));
    }
}
