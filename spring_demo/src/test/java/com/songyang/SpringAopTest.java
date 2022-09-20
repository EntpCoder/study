package com.songyang;

import com.songyang.spring5.aop.xml.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yang Song
 * @date 2022/9/19 14:22
 */
public class SpringAopTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("xml-aop/bean2.xml");
    @Test
    public void testAopBefore(){
        User bean = context.getBean(User.class);
        bean.add();
    }
}
