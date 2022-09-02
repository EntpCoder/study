package org.songyang.chapter08;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试MinorGC、MajorGc、FullGC
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 * @author Yang Song
 * @date 2022/9/1 10:59
 */
public class GcTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "songyang.top";
            while (true){
                list.add(a);
                a = a + a;
                i++;
            }
        }catch (Throwable t){
            t.printStackTrace();
            System.out.println("遍历次数为："+i);
        }

    }
}
