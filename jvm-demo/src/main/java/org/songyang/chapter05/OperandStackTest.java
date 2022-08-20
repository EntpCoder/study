package org.songyang.chapter05;

/**
 * @author Yang Song
 * @date 2022/8/20 15:14
 */
public class OperandStackTest {
    public void testAddOperation(){
        byte i = 15;
        int j = 8;
        int k  = i+j;
    }
    public void testGetSum(){
        //获取上一个栈桢返回的结果，并保存在操作数栈中
        int i = getSum();
        int j = 10;
    }
    public int getSum(){
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }
}
