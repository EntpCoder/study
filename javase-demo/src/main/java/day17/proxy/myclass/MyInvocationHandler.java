package day17.proxy.myclass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Yang Song
 * @date 2022/8/9 18:38
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        new LogUtil().log();
        Object rs = method.invoke(target, (Object[]) null);
        new LogUtil().log();
        return rs;
    }
}
