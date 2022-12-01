package com.psj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 声明当前类为Spring配置类
@Configuration
// 设置bean扫描路径，多个路径书写为字符串数组格式
@ComponentScan({"com.psj.service","com.psj.dao"})
public class SpringConfig {
}
