package com.songyang.spring5.annotation.service.impl;

import com.songyang.spring5.annotation.dao.UserDao;
import com.songyang.spring5.annotation.dao.impl.UserDaoImpl;
import com.songyang.spring5.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Yang Song
 * @date 2022/9/17 14:47
 * value对应bean id
 * 等价于<bean id= "userServiceImpl" class= ''/>
 * value的值可以省略
 * value 默认值是类的名称首字母小写
 */
@Component(value = "userServiceImpl")
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    public UserServiceImpl(@Qualifier("userDaoImpl1") UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void addUser() {
        userDao.addUser();
        System.out.println(jdbcUrl);
    }
}
