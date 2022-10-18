package com.songyang.interceptors;


import com.songyang.config.TestComponent1;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/10/12 8:51
 */
@Component
public class TestComment2 {
    private TestComponent1 comment1;
    public TestComment2(TestComponent1 comment1){
        this.comment1 = comment1;
    }

    public TestComponent1 getComment1() {
        return comment1;
    }

    public void setComment1(TestComponent1 comment1) {
        this.comment1 = comment1;
    }
}
