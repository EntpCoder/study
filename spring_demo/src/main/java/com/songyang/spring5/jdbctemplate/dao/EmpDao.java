package com.songyang.spring5.jdbctemplate.dao;

import com.songyang.spring5.jdbctemplate.pojo.Emp;

import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/19 16:00
 */
public interface EmpDao {
    /**
     * 测试JdbcTemplate注入情况
     */
    public void test();

    /**
     * 添加测试
     * @param emp 数据对象
     * @return 是否成功
     */
    public boolean addUser(Emp emp);

    /**
     * 查询所有
     * @return 所有信息
     */
    public List<Emp> selectAll();

    /**
     * 批量添加
     * @param emps 对象集合
     * @return 影响行数
     */
    public int batchInsertEmp(List<Object[]> emps);
}
