package com.songyang.controller;

import com.songyang.common.result.R;
import com.songyang.service.IAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/18 11:12
 */
@RestController
public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }
    @RequestMapping("/account/debit")
    public R<String> debit(String userId, int money){
        accountService.debit(userId,money);
        return R.ok("isOk","ok");
    }
}
