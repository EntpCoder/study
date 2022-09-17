package com.songyang;

import com.songyang.spring5.annotation.config.SpringConfig;
import com.songyang.spring5.annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yang Song
 * @date 2022/9/17 16:40
 */
public class AllAnnotationTest {
    @Test
    public void testAll(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService bean = context.getBean(UserService.class);
        bean.addUser();
    }

}
