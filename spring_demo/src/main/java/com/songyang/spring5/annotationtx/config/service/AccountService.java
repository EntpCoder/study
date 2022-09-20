package com.songyang.spring5.annotationtx.config.service;

import com.songyang.spring5.annotationtx.config.dao.AccountDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yang Song
 * @date 2022/9/19 19:53
 */
@Service
@Transactional(rollbackFor = Throwable.class)
public class AccountService {
    private final AccountDao accountDao;
    public AccountService(AccountDao accountDao){
        this.accountDao = accountDao;
    }
    public boolean transferAccounts(Integer outId,Integer inId,Integer money){
        boolean in = accountDao.addMoney(inId, money);
        int i = 1/0;
        boolean out = accountDao.reduceMoney(outId, money);
        return in && out;
    }
}
