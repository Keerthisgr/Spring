package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Headphones;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HeadphonesRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Headphones headphones = applicationContext.getBean(Headphones.class);
//        headphones.setId(76);
//        headphones.setBrandName("Realme");
//        headphones.setType("Electronic gadgets");
//        headphones.setPrice(8766.90);
        System.out.println(headphones);
    }
}
