package com.songyang.spring5.annotationtx.config.dao.impl;

import com.songyang.spring5.annotationtx.config.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Yang Song
 * @date 2022/9/19 19:52
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;
    private AccountDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public boolean addMoney(Integer id, Integer money) {
        String sql = "update account set money = money + ? where id = ?";
        return jdbcTemplate.update(sql,money,id)>0;
    }

    @Override
    public boolean reduceMoney(Integer id, Integer money) {
        String sql = "update account set money = money - ? where id = ?";
        return jdbcTemplate.update(sql,money,id)>0;
    }
}
