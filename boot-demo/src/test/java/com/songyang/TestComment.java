package com.songyang;

import com.songyang.interceptors.TestComment2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Yang Song
 * @date 2022/10/12 8:52
 */
@SpringBootTest
public class TestComment {
    @Autowired
    private TestComment2 comment2;
    @Test
    public void test(){
        System.out.println(comment2.getComment1().getName());
    }
}
