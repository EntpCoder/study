package org.songyang;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A simple unit test
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testJdbc(){
        try {
            Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai", "root", "root");
            System.out.println(root);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
