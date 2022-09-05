package com.songyang;

import com.songyang.dao.EmpDao;
import com.songyang.dao.impl.EmpDaoImpl;
import com.songyang.pojo.Emp;

import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/5 0:06
 */
public class Test {
    public static void main(String[] args) {
        EmpDao empDao = new EmpDaoImpl();
        List<Emp> emps = empDao.selectAll();
        emps.forEach(System.out::println);
    }
}
