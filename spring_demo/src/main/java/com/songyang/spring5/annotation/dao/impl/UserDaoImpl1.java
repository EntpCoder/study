package com.songyang.spring5.annotation.dao.impl;

import com.songyang.spring5.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Yang Song
 * @date 2022/9/17 16:12
 */
@Repository
public class UserDaoImpl1 implements UserDao {
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl1 add ...");
    }
}
