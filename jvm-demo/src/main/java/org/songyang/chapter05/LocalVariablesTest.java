package org.songyang.chapter05;

import java.time.LocalDate;

/**
 * @author Yang Song
 * @date 2022/8/20 9:24
 */
public class LocalVariablesTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        // 因为this变量不存在于当前方法的局部变量表中
        // System.out.println(this.count);
    }
    public void test1(String s){
        LocalDate now = LocalDate.now();
        String name = "songyang.top";
        String info = test2(now,name);
    }
    public String test2(LocalDate now,String name){
        now = null;
        name = "song";
        double weight = 130.5;
        char gender = '男';
        return now+name;
    }
    private void test3(){
        int i;
        int j = 0;
    }
    public void slotTest(){
        int a = 50;
        {
            int b = 60;
            b = a + 1;
        }
        // 变量c 使用的是 上面销毁的b的slot的位置
        int c = a + 1;
    }
    public void testType(){
        int i1 = 12;
        int i2 = 12300;
        int i3 = 254646545;
    }
}
