package com.songyang.util;

import com.songyang.dao.impl.Convert;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author Yang Song
 * @date 2022/9/4 23:24
 */
public class JdbcUtil<T> {
    private static String URL = null;
    private static String USER_NAME = null;
    private static String PASSWORD = null;
    private static String DRIVER = null;
    private Convert<T> convert;
    public JdbcUtil(Convert<T> convert){
        this.convert = convert;
    }
    static {
        InputStream ips = JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties p = new Properties();
        try {
            p.load(ips);
            URL = p.getProperty("url");
            USER_NAME = p.getProperty("username");
            PASSWORD = p.getProperty("password");
            DRIVER = p.getProperty("drivername");
            Class.forName(DRIVER);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public int executeUpdate(String sql,Object... args){
        Connection connection = getConnection();
        int count = 0;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0;i < args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(connection);
        }
        return count;
    }
    public List<T> selectMore(String sql, Object... args){
        Connection connection = getConnection();
        List<T> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0;i < args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                T t = convert.convert(rs);
                list.add(t);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public T selectOne(String sql, Object... args){
        Connection connection = getConnection();
        T t = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0;i < args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                t = convert.convert(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }
    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void closeConnection(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
