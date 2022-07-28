package day09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author Yang Song
 * @date 2022/7/28 15:26
 */
public class TestString {
    public static void main(String[] args) {
        String word = "Strings are constant; their values cannot be changed after they  are created";
        char[] chars = word.toCharArray();
        System.out.println(Arrays.toString(chars));
        char c = word.charAt(4);
        System.out.println(c);
        System.out.println(word.contains("not"));
        System.out.println(word.length());
        System.out.println(Arrays.toString(word.getBytes(StandardCharsets.UTF_8)));
        System.out.println(word.indexOf('e'));
        System.out.println(word.indexOf("an"));
        System.out.println(word.lastIndexOf('e'));
        System.out.println(word.replace('a','A'));
        System.out.println(word.replace("er","ER"));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.substring(0,5));
        System.out.println(word.substring(5,10));
    }
}
