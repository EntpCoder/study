package com.songyang;


import com.songyang.spring5.test.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Yang Song
 * @date 2022/9/20 18:24
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Spring5JunitTest {
    @Autowired
    private  User user;
    @Test
    public void test(){
        System.out.println(user);
    }
}
