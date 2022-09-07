package com.songyang;

import com.songyang.dao.EmpDao;
import com.songyang.dao.impl.EmpDaoImpl;
import com.songyang.dao.impl.convert.EmpConvert;
import com.songyang.entity.Emp;
import com.songyang.util.JdbcUtil;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/5 0:06
 */
public class Test {
    public static void main(String[] args) {
        JdbcUtil<Emp> empJdbcUtil = new JdbcUtil<>(new EmpConvert());
        List<Connection> list = new ArrayList<>();

        for(int i = 0;i < 97;i++){
            Connection connection = empJdbcUtil.getConnection();
            list.add(connection);
            System.out.println(i);
        }
        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
