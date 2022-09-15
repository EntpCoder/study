package com.songyang;


import com.songyang.spring5.Book;
import com.songyang.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // 1.加载配置文件
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    @Test
    public void spring5(){
        System.out.println(context);
        // 2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void DI(){
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        book2.setBookName("123");
        System.out.println(book1.getBookName());
    }
}
