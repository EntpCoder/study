package com.songyang.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author Yang Song
 * @date 2022/9/5 11:04
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try (InputStream ips = Resources.getResourceAsStream("config/mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
