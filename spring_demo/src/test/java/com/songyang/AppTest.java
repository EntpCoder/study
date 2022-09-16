package com.songyang;


import com.songyang.spring5.Book;
import com.songyang.spring5.Orders;
import com.songyang.spring5.User;
import com.songyang.spring5.facBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // 1.加载配置文件
    ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
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
    @Test
    public void factoryBean(){
        Book myBean = context.getBean("myBean", Book.class);
        System.out.println(myBean);
    }
    @Test
    public void beanScopes(){
        Orders orders1 = context.getBean("orders", Orders.class);
        Orders orders2 = context.getBean("orders", Orders.class);
        System.out.println(orders1);
        System.out.println(orders2);
    }
    @Test
    public void lifeCycle(){
        com.songyang.spring5.bean.Orders orders = context.getBean("orders", com.songyang.spring5.bean.Orders.class);
        System.out.println("4.获取对象");
        ((ClassPathXmlApplicationContext)context).close();
    }
}
