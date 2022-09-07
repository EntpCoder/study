package com.songyang.dao.impl;

import com.songyang.dao.EmpDao;
import com.songyang.dao.impl.convert.EmpConvert;
import com.songyang.entity.Emp;
import com.songyang.util.JdbcUtil;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/4 23:22
 */
public class EmpDaoImpl implements EmpDao {
    JdbcUtil<Emp> jdbcUtil = new JdbcUtil(new EmpConvert());
    @Override
    public int insert(Emp emp) {
        String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
        Object[] args = {emp.getDeptno(),emp.getEname()};
        return jdbcUtil.executeUpdate(sql,args);
    }

    @Override
    public int deleteById(Long id) {
        String sql = "delete from emp where emp_no = ?";
        return jdbcUtil.executeUpdate(sql,id);
    }

    @Override
    public int update(Emp emp) {
        return 0;
    }

    @Override
    public List<Emp> selectAll() {
        String sql = "select * from emp";
        return jdbcUtil.selectMore(sql);
    }

    @Override
    public Emp selectById(Long id) {
        return null;
    }
}
