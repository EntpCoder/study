package com.songyang;

import com.songyang.entity.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @author Yang Song
 * @date 2022/9/26 15:08
 */
@SpringBootTest
public class ApplicationTest {
    @Autowired
    public RedisTemplate<String,Object> redisTemplate;
    @Test
    public void setRedisTemplateTest(){
        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        Orders orders = new Orders();
        orders.setId("123123");
        orders.setOrderSubject("测试数据1");
        orders.setPaidTime(LocalDateTime.now());
        orders.setPaidAmount(new BigDecimal("12.56"));
        ops.set("order::1",orders);
        redisTemplate.expire("order::1",1, TimeUnit.MINUTES);
    }
}
