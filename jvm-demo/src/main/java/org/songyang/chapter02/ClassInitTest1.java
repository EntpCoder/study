package org.songyang.chapter02;
/**
 * @author Yang Song
 * @date 2022/8/18 9:24
 */
public class ClassInitTest1 {
    private static int myNum = 521;
    static {
        myNum = 52;
        num = 10;
        System.out.println(myNum);
        //System.out.println(num);  报错 Illegal forward reference 非法的前向引用
    }
    /**
     * linking时prepare num = 0 --> initial: num = 10 --> num = 30
     */
    private static int num = 30;
    public static void main(String[] args) {
        // myNum 结果为52
        System.out.println(myNum);
        // num结果为30
        System.out.println(num);
    }
}
