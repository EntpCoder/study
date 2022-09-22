package com.songyang;

import com.songyang.entity.Emp;
import com.songyang.service.IEmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
}
