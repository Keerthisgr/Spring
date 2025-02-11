package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Helmet;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelmetRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Helmet helmet = applicationContext.getBean(Helmet.class);
//        helmet.setId(89);
//        helmet.setBrandName("Spider");
//        helmet.setPrice(2800.90);
        System.out.println(helmet);

    }
}
