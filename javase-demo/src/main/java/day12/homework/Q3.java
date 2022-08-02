package day12.homework;
/**
 * @author Yang Song
 * @date 2022/8/2 17:56
 */
public class Q3 {
    public static String moveStr(String str){
        if(str == null || str.length() == 0){
            return "";
        }
        char[] chars = str.toCharArray();
        for(int i = 1;i < chars.length;i++){
            int j = i;
            char temp = chars[i];
            // 如果当前字母是小写(temp) 且前一个是大写
            // 就需要找到当前小写字母要插入的位置 找的同时将大写字母往后移动
            while (j > 0 && isBig(chars[j - 1]) && !isBig(temp)){
                chars[j] = chars[j - 1];
                j--;
            }
            chars[j] = temp;
        }
        return String.valueOf(chars);
    }
    public static boolean isBig(char ch){
        return ch >= 'A' && ch <= 'Z';
    }
    public static void main(String[] args) {
        String s = "AkleBiCeilD";
        System.out.println(moveStr(s));
    }
}
