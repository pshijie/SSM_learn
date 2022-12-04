package com.psj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
// 方案1：缩小范围
// 其实可以不添加上com.psj.dao，因为dao包最终是交给MapperScannerConfigurer对象进行扫描处理
// @ComponentScan({"com.psj.service","com.psj.dao"})

// 方法2：排除
// 设置spring配置类加载bean时的过滤规则，当前要求排除掉表现层对应的bean
// excludeFilters属性：设置扫描加载bean时，排除的过滤规则
//      type属性：设置排除规则，当前使用按照bean定义时的注解类型进行排除
//      classes属性：设置排除的具体注解类，当前设置排除@Controller定义的bean
@ComponentScan(value = "com.psj",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)
public class SpringConfig {
}
