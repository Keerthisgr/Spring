package com.xworkz.customerapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("com.xworkz.customerapp")

public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("Spring configuration is invoked");
    }
}
