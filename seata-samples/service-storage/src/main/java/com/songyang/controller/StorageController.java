package com.songyang.controller;

import com.songyang.common.result.R;
import com.songyang.service.IStockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/10/18 11:55
 */
@RestController
public class StorageController {
    private final IStockService stockService;

    public StorageController(IStockService stockService) {
        this.stockService = stockService;
    }
    @RequestMapping("/stock/deduct")
    public R<String> deduct(String commodityCode, int count){
        stockService.deduct(commodityCode,count);
        return R.ok("isOk","ok");
    }
}
