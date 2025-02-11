package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Refrigerator;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Refrigerator refrigerator = applicationContext.getBean(Refrigerator.class);
//        refrigerator.setId(780);
//        refrigerator.setBrandName("LG");
//        refrigerator.setPrice(89990.90);
        System.out.println(refrigerator);
    }
}
