package com.songyang;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.songyang.entity.Company;
import com.songyang.mapper.CompanyMapper;
import com.songyang.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
import static com.songyang.mapper.CompanyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;


/**
 * Unit test for simple App.
 */
public class AppTest {
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    CompanyMapper mapper = sqlSession.getMapper(CompanyMapper.class);
    @Test
    public void selectAll(){
        PageHelper.startPage(1, 2);
        List<Company> select = mapper.select(c ->
                c.where(companyType,isEqualTo("民营公司"))
                        .orderBy(companyId));
        PageInfo<Company> pageInfo = new PageInfo<>(select);
        System.out.println(pageInfo);
    }
}
