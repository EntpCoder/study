package day16.myclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author Yang Song
 * @date 2022/8/8 19:04
 */
public class TestMain {
    public static void main(String[] args) {


        getFields(Student.class);
    }
    public static void getFields(Class<?> c){
        Field[] fields = c.getDeclaredFields();
        for (Field f:
             fields) {
            int fModifiers = f.getModifiers();
            boolean aStatic = Modifier.isStatic(fModifiers);
            System.out.println(aStatic);
        }
    }
    public static Object newInstance(Class<?> c){
        Object o = null;
        try {
            Constructor<?> constructor = c.getConstructor(int.class, String.class, int.class);
            o = constructor.newInstance(1, "123", 4);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return o;
    }










    public static void show(Object o){
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getFields();
        for (Field f :
                fields) {
            try {
                Object v = f.get(o);
                System.out.println(v);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }
}
