package day16.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Yang Song
 * @date 2022/8/8 16:56
 */
public class MyProxy implements InvocationHandler {
    private Object target;
    public Object getProxy(Object target){
        this.target = target;
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        proxy = this.target;
        Object result = method.invoke(proxy, args);
        if("save".equals(method.getName())|| "update".equals(method.getName()) || "delete".equals(method.getName())){
            new LogUtil().addLog();
        }
        return result;
    }
}
