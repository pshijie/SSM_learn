package com.psj.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.psj")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
