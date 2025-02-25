package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Telivision;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TelivisionRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Telivision telivision = applicationContext.getBean(Telivision.class);
//        telivision.setId(87);
//        telivision.setBrandName("Panasonic");
//        telivision.setPrice(49876.90);
        System.out.println(telivision);
    }
}
