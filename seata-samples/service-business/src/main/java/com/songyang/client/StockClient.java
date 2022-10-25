package com.songyang.client;

import com.songyang.common.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yang Song
 * @date 2022/10/18 12:08
 */
@Component
@FeignClient(name = "seata-storage")
public interface StockClient {
    /**
     * 仓储服务
     * @param commodityCode 商品编号
     * @param count 数量
     * @return 是否成功
     */
    @RequestMapping("/stock/deduct")
    public R<String> deduct(@RequestParam("commodityCode") String commodityCode,
                                @RequestParam("count")Integer count);
}
