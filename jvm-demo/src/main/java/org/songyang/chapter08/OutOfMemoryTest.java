package org.songyang.chapter08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Yang Song
 * @date 2022/8/25 16:37
 */
public class OutOfMemoryTest {
    public static void main(String[] args) {
        List<Picture> list = new ArrayList<>();
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024*1024)));
        }
    }
}
class Picture{
    private byte[] pixels;
    public Picture(int length){
        this.pixels = new byte[length];
    }
}
