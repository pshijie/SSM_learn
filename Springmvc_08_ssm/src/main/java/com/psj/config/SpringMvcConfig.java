package com.psj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration  // 标识该类为配置类
@ComponentScan("com.psj.controller")  // 扫描Controller所在的包
@EnableWebMvc  // 开启SpringMVC注解支持
public class SpringMvcConfig {
}
