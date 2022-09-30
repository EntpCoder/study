package com.songyang;

import com.songyang.entity.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Yang Song
 * @date 2022/9/26 15:08
 */
@SpringBootTest
public class ApplicationTest {
    @Autowired
    public RedisTemplate<String,List<Orders>> redisTemplate;
    @Autowired
    public RedisTemplate<String,Integer> integerRedisTemplate;
    @Test
    public void setRedisTemplateTest(){
        ValueOperations<String, List<Orders>> ops = redisTemplate.opsForValue();
        List<Orders> list = new ArrayList<>();
        Orders orders = new Orders();
        orders.setId("123123");
        orders.setOrderSubject("测试数据1");
        orders.setPaidTime(LocalDateTime.now());
        orders.setPaidAmount(new BigDecimal("12.56"));
        Orders orders2 = new Orders();
        orders2.setId("123123");
        orders2.setOrderSubject("测试数据2");
        orders2.setPaidTime(LocalDateTime.now());
        orders2.setPaidAmount(new BigDecimal("1226"));
        list.add(orders);
        list.add(orders2);
        ops.set("orders::1",list);
        redisTemplate.expire("orders::1",1, TimeUnit.MINUTES);
    }
    @Test
    public void getRedisTemplateTest(){
        ValueOperations<String, List<Orders>> ops = redisTemplate.opsForValue();
        List<Orders> orders = ops.get("orders::1");
        orders.forEach(System.out::println);
    }
    @Test
    public void initNum(){
        integerRedisTemplate.opsForValue().set("num",0);
    }
    @Test
    public void testGetNum(){
        Integer num = integerRedisTemplate.opsForValue().get("num");
        System.out.println(num);
    }
}
