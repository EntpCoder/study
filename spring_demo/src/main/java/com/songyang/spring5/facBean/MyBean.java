package com.songyang.spring5.facBean;

import com.songyang.spring5.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Yang Song
 * @date 2022/9/16 10:12
 */
public class MyBean implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBookName("JVM");
        return book;
    }
    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
