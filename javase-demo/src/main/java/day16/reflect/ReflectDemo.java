package day16.reflect;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Yang Song
 * @date 2022/8/8 14:09
 */public class ReflectDemo {
    public static void main(String[] args) {
        Class<Student> aClass = Student.class;
        Method[] methods = aClass.getDeclaredMethods();
        for (Method m :
                methods) {
            if(Modifier.isStatic(m.getModifiers())){
                System.out.println(m.getModifiers());
                System.out.println(m.getName());
            }

        }
    }
}
