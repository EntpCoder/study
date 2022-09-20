package com.songyang;

import com.songyang.spring5.annotationtx.config.service.AccountService;
import com.songyang.spring5.aop.xml.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Yang Song
 * @date 2022/9/19 19:53
 */
public class StringTxTest {
    ApplicationContext context1 = new ClassPathXmlApplicationContext("xml-tx/bean1.xml");
    @Test
    public void testSS(){
        AccountService bean = context1.getBean(AccountService.class);
        boolean b = bean.transferAccounts(2, 1, 10);
        System.out.println(b);
    }
    @Test
    public void test(){
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean(User.class, User::new);
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }
}
