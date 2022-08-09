package day17.proxy.myclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Yang Song
 * @date 2022/8/9 18:30
 */
public class IInvocationHandler {
    private Object target;
    public Object zhiXing(Method m,Object...args){
        System.out.println("增强");
        Object r = null;
        try {
            r = m.invoke(target, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("增强");
        return r;
    }
}
