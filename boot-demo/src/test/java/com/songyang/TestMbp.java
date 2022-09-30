package com.songyang;

import com.songyang.entity.Emp;
import com.songyang.service.IEmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

/**
 * @author Yang Song
 * @date 2022/9/22 11:09
 */
@SpringBootTest
public class TestMbp {
    @Autowired
    private IEmpService iEmpService;
    @Test
    public void testSelect(){
        List<Emp> list = iEmpService.list();
        list.forEach(System.out::println);
    }
    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setEname("测试id");
        iEmpService.save(emp);
        System.out.println(emp.getEmpno().length());
    }
    @Test
    public void testUUID(){
        System.out.println(UUID.randomUUID().toString().replaceAll("-","").length());
    }
}
