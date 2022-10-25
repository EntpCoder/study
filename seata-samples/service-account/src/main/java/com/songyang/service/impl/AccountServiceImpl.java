package com.songyang.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.songyang.common.entity.Account;
import com.songyang.mapper.AccountMapper;
import com.songyang.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yang Song
 * @since 2022-10-18
 */
@Service
public class AccountServiceImpl implements IAccountService {
    private final AccountMapper accountMapper;
    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }
    @Override
    public void debit(String userId, int money) {
        UpdateWrapper<Account> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user_id",userId);
        updateWrapper.setSql("money = money -"+money);
        accountMapper.update(null,updateWrapper);
    }
}
