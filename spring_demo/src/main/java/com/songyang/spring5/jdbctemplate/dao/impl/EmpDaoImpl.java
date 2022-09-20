package com.songyang.spring5.jdbctemplate.dao.impl;

import com.songyang.spring5.jdbctemplate.dao.EmpDao;
import com.songyang.spring5.jdbctemplate.pojo.Emp;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/19 16:00
 */
@Repository
public class EmpDaoImpl implements EmpDao {
    private final JdbcTemplate jdbcTemplate;
    public EmpDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public void test(){
        System.out.println(jdbcTemplate);
    }
    @Override
    public boolean addUser(Emp emp) {
        String sql = "insert into emp(empno,ename) values(?,?)";
        int update = jdbcTemplate.update(sql, emp.getDeptno(), emp.getEname());
        return update > 0;
    }

    @Override
    public List<Emp> selectAll() {
        String sql = "select * from emp";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Emp.class));
    }

    @Override
    public int batchInsertEmp(List<Object[]> emps) {
        String sql = "insert into emp(empno,ename) values(?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, emps);
        System.out.println(Arrays.toString(ints));
        return 0;
    }

}
