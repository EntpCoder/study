package day10;


/**
 * @author Yang Song
 * @date 2022/7/29 9:01
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Song";
        StringBuilder s2 = new StringBuilder("Song");
        String s3 = appendYang(s1);
        StringBuilder s4 = appendYang(s2);
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);
    }
    public static String appendYang(String s){
        s += "Yang";
        return s;
    }
    public static StringBuilder appendYang(StringBuilder s){
        return s.append("Yang");
    }
}
