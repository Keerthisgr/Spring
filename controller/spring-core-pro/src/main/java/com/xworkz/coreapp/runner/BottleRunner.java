package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Bottle;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BottleRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Bottle bottle = applicationContext.getBean(Bottle.class);
//        bottle.setId(56);
//        bottle.setBrandName("Pigeon");
//        bottle.setCapacity("2ltr");
//        bottle.setPrice(567.90);
        System.out.println(bottle);
    }
}
