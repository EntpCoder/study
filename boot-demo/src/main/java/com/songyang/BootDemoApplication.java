package com.songyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 * @author Yang Song
 */
@SpringBootApplication
public class BootDemoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(BootDemoApplication.class,args);
    }
    @Bean
    public RestTemplate test(){
        return new RestTemplate();
    }
}
