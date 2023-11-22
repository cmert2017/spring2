package com.cydeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.cydeo") //either we can do it like this or like below one by one
@ComponentScan(basePackages = {"com.cydeo.proxy","com.cydeo.repository","com.cydeo.service"})
public class ProjectConfig {

}
