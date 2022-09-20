package com.songyang.spring5.tx.service;

import com.alibaba.fastjson2.JSONObject;
import com.songyang.spring5.aop.xml.User;
import com.songyang.spring5.tx.dao.AccountDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yang Song
 * @date 2022/9/19 19:53
 */
@Service
@Transactional
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
