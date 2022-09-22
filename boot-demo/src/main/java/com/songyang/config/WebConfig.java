package com.songyang.config;

import com.songyang.interceptors.LoginInterceptors;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 注册拦截器
 * @author Yang Song
 * @date 2022/9/22 14:23
 */
@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final LoginInterceptors loginInterceptors;
    public WebConfig(LoginInterceptors loginInterceptors){
        this.loginInterceptors = loginInterceptors;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptors).addPathPatterns("/**").excludePathPatterns("/emp/index");
    }
}
