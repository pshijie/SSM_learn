package com.psj.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    // 定义bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    // SqlSessionFactoryBean中将SqlSessionFactory的创建进行了封装，简化对象的创建，
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {  // dataSource在JdbcConfig中已经注入到Spring中
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        // 下面两句分别是对SqlMapConfig.xml配置文件中typeAliases和environments的替换
        ssfb.setTypeAliasesPackage("com.psj.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    // 定义bean，返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        // MapperScannerConfigurer用来处理原始配置文件中的mappers相关配置，加载数据层的Mapper接口类
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        // 对SqlMapConfig.xml配置文件中mappers的替换
        msc.setBasePackage("com.psj.dao");
        return msc;
    }

}



