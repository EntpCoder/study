package com.songyang.spring5.jdbctemplate.service;

import com.songyang.spring5.jdbctemplate.dao.EmpDao;
import com.songyang.spring5.jdbctemplate.pojo.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/19 15:59
 */
@Service
public class EmpService {
    private final EmpDao empDao;
    public EmpService(EmpDao empDao){
        this.empDao = empDao;
    }
    public void add(){
        System.out.println(empDao);
        empDao.test();
    }
    public boolean saveEmp(Emp emp){
        return empDao.addUser(emp);
    }
    public List<Emp> selectAll(){
        return empDao.selectAll();
    }
    public int batchInsertEmp(List<Object[]> emps) {
        empDao.batchInsertEmp(emps);
        return 0;
    }
}
