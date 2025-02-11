package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Shoes;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShoesRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Shoes shoes = applicationContext.getBean(Shoes.class);
//        shoes.setId(87);
//        shoes.setBrandName("Nike");
//        shoes.setPrice(9876.90);
        System.out.println(shoes);
    }
}
