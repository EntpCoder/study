package day17.proxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Yang Song
 * @date 2022/8/9 13:46
 */
public class MyMethodInterceptor implements MethodInterceptor {
    private Object target;
    public MyMethodInterceptor(Object target){
        this.target = target;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object o1 = method.invoke(target, objects);
        System.out.println("代理");
        return o1;
    }
}
