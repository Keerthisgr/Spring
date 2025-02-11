package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Bracelet;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BraceletRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Bracelet bracelet = applicationContext.getBean(Bracelet.class);
//        bracelet.setId(45);
//        bracelet.setMetalType("Gold");
//        bracelet.setPrice(87654.90);
        System.out.println(bracelet);
    }
}
