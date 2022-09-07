package com.songyang;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.songyang.mapper.EmpMapper;
import com.songyang.entity.Emp;
import com.songyang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testMybatis(){
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> list1 = empMapper.selectAll();
        List<Emp> list2 = empMapper.selectAll();
        empMapper.selectById(101L);

    }
    @Test
    public void insert(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp e = new Emp(988999991L,"123","123",2000L, LocalDate.parse("2021-02-10"),20.0,20.0,10L);
        int i = mapper.insert(e);
        sqlSession.commit();
        System.out.println(i);
    }
}
