package com.songyang.client;

import com.songyang.common.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yang Song
 * @date 2022/10/18 11:10
 */
@Component
@FeignClient(name = "seata-account")
public interface AccountClient {
    /**
     * 远程调用
     * @param userId 用户id
     * @param money 金额
     * @return 是否成功
     */
    @GetMapping("/account/debit")
    R<String> debit(@RequestParam("userId") String userId,
                        @RequestParam("money") Integer money);
}
