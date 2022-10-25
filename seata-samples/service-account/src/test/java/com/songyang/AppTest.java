package com.songyang;


import com.songyang.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest 
{
    @Autowired
    private IAccountService accountService;
    @Test
    public void testDebit() {
        accountService.debit("101",1);
    }
}
