package com.songyang.dao.impl.convert;

import com.songyang.dao.impl.Convert;
import com.songyang.entity.Emp;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Yang Song
 * @date 2022/9/4 23:59
 */
public class EmpConvert implements Convert<Emp> {
    @Override
    public Emp convert(ResultSet rs) {
        Emp e = new Emp();
        try {
            e.setEmpno(rs.getLong(1));
            e.setEname(rs.getString(2));
            e.setJob(rs.getString(3));
            e.setMgr(rs.getLong(4));
            e.setHiredate(rs.getString(5));
            e.setSalary(rs.getDouble(6));
            e.setComm(rs.getDouble(7));
            e.setDeptno(rs.getLong(8));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return e;
    }
}
