package com.songyang.spring5.annotation.dao.impl;

import com.songyang.spring5.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;


/**
 * @author Yang Song
 * @date 2022/9/17 15:20
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl add ...");
    }
}
