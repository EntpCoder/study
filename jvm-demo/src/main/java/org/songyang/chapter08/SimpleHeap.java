package org.songyang.chapter08;

/**
 * @author Yang Song
 * @date 2022/8/25 15:19
 */
public class SimpleHeap {
    //属性、成员变量
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }
    public static void main(String[] args) {
        SimpleHeap sl = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
    }
}
