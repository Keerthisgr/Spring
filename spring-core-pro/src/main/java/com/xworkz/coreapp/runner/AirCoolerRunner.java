package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.AirCooler;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirCoolerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        AirCooler airCooler = applicationContext.getBean(AirCooler.class);
//        airCooler.setId(45);
//        airCooler.setBrandName("Pigeon");
//        airCooler.setPrice(87654.90);
        System.out.println(airCooler);

    }
}
