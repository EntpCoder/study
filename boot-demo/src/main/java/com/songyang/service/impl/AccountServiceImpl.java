package com.songyang.service.impl;

import com.songyang.entity.Account;
import com.songyang.mapper.AccountMapper;
import com.songyang.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-22
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
