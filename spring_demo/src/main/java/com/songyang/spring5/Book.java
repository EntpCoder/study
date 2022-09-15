package com.songyang.spring5;

/**
 * setter注入
 * @author Yang Song
 * @date 2022/9/15 14:15
 */
public class Book {
    private String bookName;
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }
}
