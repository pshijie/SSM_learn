package com.psj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;

@Configuration
@ComponentScan("com.psj.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
