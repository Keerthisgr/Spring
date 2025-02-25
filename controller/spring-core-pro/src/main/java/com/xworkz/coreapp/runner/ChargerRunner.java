package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Charger;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChargerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Charger charger = applicationContext.getBean(Charger.class);
//        charger.setId(76);
//        charger.setBrandName("Dell");
//        charger.setPrice(1789.90);
        System.out.println(charger);

    }
}
