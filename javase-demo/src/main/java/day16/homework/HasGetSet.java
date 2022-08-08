package day16.homework;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Yang Song
 * @date 2022/8/8 20:03
 */
public class HasGetSet {
    public static void main(String[] args) {
        boolean result1 = hasGetMethod(Product.class,"proId");
        boolean result2 = hasSetMethod(Product.class,"proId");
        System.out.println(result1);
        System.out.println(result2);
    }
    public static boolean hasGetMethod(Class<?> c,String fieldName){
        try {
            Field field = c.getDeclaredField(fieldName);
            // 如果列名存在 首字母转大写
            fieldName = titleCase(fieldName);
            // 拼接成方法名
            String methodName = "get"+fieldName;
            // 如果方法存在判定返回值
            Method method = c.getMethod(methodName);
            if(method.getReturnType() != field.getType()){
                return false;
            }
        } catch (NoSuchFieldException e) {
            System.out.println("没有这个列");
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
        return true;
    }

    public static boolean hasSetMethod(Class<?> c,String fieldName){
        try {
            Field field = c.getDeclaredField(fieldName);
            // 如果列名存在 首字母转大写
            fieldName = titleCase(fieldName);
            String methodName = "set"+fieldName;
            // 如果方法存在判定返回值
            Method method = c.getMethod(methodName, field.getType());
            if(method.getReturnType() != void.class){
                return false;
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            System.out.println("字段不存在");
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
        return true;
    }
    public static String titleCase(String s){
        char[] chars = s.toCharArray();
        if(Character.isLowerCase(chars[0])){
            chars[0] -= 32;
        }
        return String.valueOf(chars);
    }
}
