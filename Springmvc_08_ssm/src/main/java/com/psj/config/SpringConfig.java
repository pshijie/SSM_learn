package com.psj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration  // 标识该类为配置类
@ComponentScan({"com.psj.service"})  // 扫描Service所在的包
@PropertySource("classpath:jdbc.properties") // 读取外部的properties配置文件
@Import({JdbcConfig.class,MyBatisConfig.class})  // 整合Mybatis需要引入Mybatis相关配置类
@EnableTransactionManagement  // 在Service层要管理事务
public class SpringConfig {
}
