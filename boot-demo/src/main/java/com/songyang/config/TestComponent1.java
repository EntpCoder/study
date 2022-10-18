package com.songyang.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Yang Song
 * @date 2022/10/12 8:50
 */
@Component
@ConfigurationProperties(prefix = "jwt")
public class TestComponent1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
