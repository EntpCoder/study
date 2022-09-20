package com.songyang.spring5.annotationtx.config.dao;

/**
 * @author Yang Song
 * @date 2022/9/19 19:52
 */
public interface AccountDao{
    /**
     * 增加钱
     * @param id id
     * @param money 钱
     * @return 是否成功
     */
    public boolean addMoney(Integer id,Integer money);

    /**
     * 减少钱
     * @param id id
     * @param money 钱
     * @return 是否成功
     */
    public boolean reduceMoney(Integer id,Integer money);
}
