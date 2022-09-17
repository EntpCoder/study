package com.songyang;


import com.alibaba.druid.pool.DruidDataSource;
import com.songyang.spring5.xml.Book;
import com.songyang.spring5.xml.Orders;
import com.songyang.spring5.xml.User;
import com.songyang.spring5.xml.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class SpringXmlTest
{
    // 1.加载配置文件
    ApplicationContext context = new ClassPathXmlApplicationContext("xml-configuration/bean6.xml");
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
        com.songyang.spring5.xml.bean.Orders orders = context.getBean("orders", com.songyang.spring5.xml.bean.Orders.class);
        System.out.println("4.获取对象");
        ((ClassPathXmlApplicationContext)context).close();
    }
    @Test
    public void autoWire(){
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }
    @Test
    public void testProperties() throws SQLException {
        DruidDataSource bean = context.getBean(DruidDataSource.class);
        System.out.println(bean.getConnection());
    }

}
