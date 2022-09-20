package com.songyang.spring5.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Yang Song
 * @date 2022/9/17 16:37
 */
@Configuration
@ComponentScan(basePackages = {"com.songyang.spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
