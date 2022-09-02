package org.songyang.chapter08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Yang Song
 * @date 2022/8/31 11:22
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024*200)];

    public static void main(String[] args) {
        List<HeapInstanceTest> list = new ArrayList<>();
        while (true){
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
