package day09;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Yang Song
 * @date 2022/7/28 13:49
 */
public class TestMain {
    public static void main(String[] args) throws IOException {
        String s0 = "helloword";
        String s1 = "hello";
        String s2 = "word";
        String s3 = s1 + s2;
        String s4 = "hello" + "word";
        System.out.println(s0 == s4);
        System.out.println(s0 == s3);
    }
}
