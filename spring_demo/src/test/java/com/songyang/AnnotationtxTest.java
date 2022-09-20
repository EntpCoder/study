package com.songyang;

import com.songyang.spring5.annotationtx.config.MyConfig;
import com.songyang.spring5.annotationtx.config.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yang Song
 * @date 2022/9/20 16:11
 */
public class AnnotationtxTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AccountService bean = context.getBean(AccountService.class);
        boolean b = bean.transferAccounts(2, 1, 10);
        System.out.println(b);
    }
}
