package com.songyang;

import com.songyang.spring5.annotation.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yang Song
 * @date 2022/9/17 14:40
 */
public class SpringAnnotationTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("xml-annotation/bean1.xml");
    @Test
    public void testOne(){
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        userServiceImpl.addUser();
    }
}
