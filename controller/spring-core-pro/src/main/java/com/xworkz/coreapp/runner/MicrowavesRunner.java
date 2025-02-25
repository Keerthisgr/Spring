package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Microwaves;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MicrowavesRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Microwaves microwaves = applicationContext.getBean(Microwaves.class);
//        microwaves.setId(23);
//        microwaves.setBrandName("Pigeon");
//        microwaves.setPrice(8900.90);
        System.out.println(microwaves);
    }
}
