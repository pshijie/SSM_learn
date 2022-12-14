package com.psj.config;

import com.psj.controller.interceptor.ProjectInterceptor;
import com.psj.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 未简化版：需要额外创建SpringMvcSupport.java
//@Configuration
//@ComponentScan({"com.psj.controller","com.psj.config"})
//@EnableWebMvc
//public class SpringMvcConfig{
//}

// 简化版：无需额外创建SpringMvcSupport.java
@Configuration
@ComponentScan({"com.psj.controller"})
@EnableWebMvc
// 实现WebMvcConfigurer接口可以简化开发，但具有一定的侵入性
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Autowired
    private ProjectInterceptor2 projectInterceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置多拦截器
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/books", "/books/*");
    }
}