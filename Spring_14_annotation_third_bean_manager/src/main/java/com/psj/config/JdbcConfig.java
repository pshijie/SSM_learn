package com.psj.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.psj.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// 和SpringConfig类中的ComponentScan注解配合使用
// @Configuration
public class JdbcConfig {

    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/xxxx")
    private String url;
    @Value("xxxx")
    private String userName;
    @Value("xxxx")
    private String password;

    // 1.定义一个方法获得要管理的对象
    // 2.添加@Bean，表示当前方法的返回值是一个bean
    // @Bean修饰的方法，形参根据类型自动装配
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
