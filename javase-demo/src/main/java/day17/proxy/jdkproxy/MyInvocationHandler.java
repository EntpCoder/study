package day17.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Yang Song
 * @date 2022/8/9 10:43
 */
public class MyInvocationHandler implements InvocationHandler {
    private final Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("save".equals(method.getName())){
            System.out.println("后置通知");
        }
        // 执行目标方法
        Object result = method.invoke(target, args);
        // 方法增强
        if("save".equals(method.getName())){
            System.out.println("前置通知");
        }
        return result;
    }
}
