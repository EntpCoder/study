package com.songyang.service;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Yang Song
 * @since 2022-10-18
 */
public interface IAccountService {
    /**
     * 余额扣款
     *
     * @param userId 用户ID
     * @param money  扣款金额
     */
    void debit(String userId, int money);
}
