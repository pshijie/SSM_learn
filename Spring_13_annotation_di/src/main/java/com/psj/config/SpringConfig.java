package com.psj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.psj")
// @PropertySource加载properties配置文件
@PropertySource({"jdbc.properties"})
public class SpringConfig {
}
