package org.songyang.chapter08;

/**
 * -Xms60m -Xmx60m -XX:+PrintGCDetails
 * @author Yang Song
 * @date 2022/9/1 14:21
 */
public class YoungOldArea {
    public static void main(String[] args) {
        byte[] bytes = new byte[1024*1024*20];
    }
}
