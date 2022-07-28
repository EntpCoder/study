package day09.inclass;

/**
 * @author Yang Song
 * @date 2022/7/28 20:34
 */
public class MyUtil {
    public static Object compareTest(Object o1 , Object o2,MyCompare myCompare){
        int i = myCompare.compare(o1, o2);
        return i > 0 ? o1 : o2;
    }
}
