package com.songyang;

import com.songyang.spring5.jdbctemplate.pojo.Emp;
import com.songyang.spring5.jdbctemplate.service.EmpService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/19 16:04
 */
public class SpringJdbcTemplateTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("xml-jdbc-template/bean1.xml");
    EmpService empService = context.getBean(EmpService.class);
    @Test
    public void testJdbc(){
        System.out.println(empService);
        empService.add();
    }
    @Test
    public void testAdd(){
        Emp emp = new Emp();
        emp.setDeptno(999L);
        emp.setEname("宋ss");
        boolean b = empService.saveEmp(emp);
        System.out.println(b);
    }
    @Test
    public void testSelectForObject(){
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String sql = "select * from emp where empno = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 7369);
        System.out.println(emp);
    }
    @Test
    public void testSelectAll(){
        EmpService bean = context.getBean(EmpService.class);
        List<Emp> emps = bean.selectAll();
        emps.forEach(System.out::println);
    }
    @Test
    public void testBatchInsert(){
        EmpService bean = context.getBean(EmpService.class);
        List<Object[]> objects = new ArrayList<>();
        Object[] o1 = {1L,"宋1"};
        Object[] o2 = {2L,"宋2"};
        Object[] o3 = {3L,"宋3"};
        Collections.addAll(objects,o1,o2,o3);
        bean.batchInsertEmp(objects);
    }


}
