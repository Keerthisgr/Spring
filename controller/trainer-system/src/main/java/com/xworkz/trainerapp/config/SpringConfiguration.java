package com.xworkz.trainerapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.trainerapp")
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("Spring configuration is invoked!!");
    }
}
