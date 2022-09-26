package com.songyang.service.impl;

import com.songyang.entity.User;
import com.songyang.mapper.UserMapper;
import com.songyang.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 * @author Yang Song
 * @since 2022-09-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
