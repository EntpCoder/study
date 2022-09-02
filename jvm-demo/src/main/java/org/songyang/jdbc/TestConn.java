package org.songyang.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Yang Song
 * @date 2022/9/2 14:26
 */
public class TestConn {
    public static void main(String[] args) {
        InputStream stream = TestConn.class.getResourceAsStream("/dbConfig.properties");
        InputStream resourceAsStream = TestConn.class.getClassLoader().getResourceAsStream("dbConfig.properties");
        System.out.println(stream);
        System.out.println(resourceAsStream);
        Properties p = new Properties();
        try {
            p.load(stream);
            System.out.println(p.getProperty("userName"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
