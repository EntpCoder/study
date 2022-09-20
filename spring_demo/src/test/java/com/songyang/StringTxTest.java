package com.songyang;

import com.songyang.spring5.tx.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yang Song
 * @date 2022/9/19 19:53
 */
public class StringTxTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("xml-tx/bean1.xml");
    @Test
    public void testSS(){
        AccountService bean = context.getBean(AccountService.class);
        boolean b = bean.transferAccounts(2, 1, 10);
        System.out.println(b);
    }
}
