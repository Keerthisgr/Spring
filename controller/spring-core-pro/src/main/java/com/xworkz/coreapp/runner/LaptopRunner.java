package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Laptop;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Laptop laptop = applicationContext.getBean(Laptop.class);
//        laptop.setId(45);
//        laptop.setBrandName("Dell");
//        laptop.setModel("Inspiron");
//        laptop.setPrice(55789.99);
        System.out.println(laptop);
    }
}
