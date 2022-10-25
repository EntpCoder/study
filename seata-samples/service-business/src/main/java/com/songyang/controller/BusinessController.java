package com.songyang.controller;

import com.songyang.common.result.R;
import com.songyang.service.IBusinessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/18 12:17
 */
@RestController
public class BusinessController {
    private final IBusinessService businessService;

    public BusinessController(IBusinessService businessService) {
        this.businessService = businessService;
    }
    @RequestMapping("/business/buy")
    public R<String> purchase(String userId, String commodityCode, int orderCount){
        businessService.purchase(userId,commodityCode,orderCount);
        return R.ok("isOk","ok");
    }
}
