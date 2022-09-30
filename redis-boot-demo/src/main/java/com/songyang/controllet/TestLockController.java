package com.songyang.controllet;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang Song
 * @date 2022/9/28 15:34
 */
@RestController
public class TestLockController {
    private final RedisTemplate<String,Integer> redisTemplate;
    public TestLockController(RedisTemplate<String,Integer> redisTemplate){
        this.redisTemplate = redisTemplate;
    }
    /**
     * 未加锁
     * ++操作不是一个原子操作
     * @return ok
     */
    @GetMapping("/t2")
    public String test02(){
        //1. 查询num值
        Integer num = redisTemplate.opsForValue().get("num");
        //2. 判断num是否为空
        if(num==null){
            return "error";
        }
        //将num值+1
        redisTemplate.opsForValue().set("num",++num);
        return "ok";
    }
    /**
     * 提前在redis中设置set num 0
     */
    @GetMapping("/t1")
    public String test01(){
        //1. 获取锁 - setnx
        Boolean flag = redisTemplate.opsForValue().setIfAbsent("lock",1);
        //2. 判断是否获取锁
        if(flag != null && flag){
            System.out.println("获得锁========================");
            //1. 查询num值
            Integer num = redisTemplate.opsForValue().get("num");
            //2. 判断num是否为空
            if(num==null){
                return "error";
            }
            //将num值+1
            redisTemplate.opsForValue().set("num",++num);
            //3. 释放锁
            redisTemplate.delete("lock");
            System.out.println("释放锁");
        }else{
            test01();
        }
        return "ok";
    }
    @GetMapping("/get")
    public String getNum(){
        return "num 值为:"+redisTemplate.opsForValue().get("num");
    }
    @GetMapping("/init")
    public String init(){
        redisTemplate.opsForValue().set("num",0);
        return "初始化 num为 :"+redisTemplate.opsForValue().get("num");
    }
}
