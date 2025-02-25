package com.xworkz.diapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.diapp")
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("Spring configuration's default constructor is invoked!!...");
    }
}
