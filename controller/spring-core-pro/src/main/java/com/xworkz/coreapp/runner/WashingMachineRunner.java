package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.WashingMachine;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WashingMachineRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        WashingMachine washingMachine = applicationContext.getBean(WashingMachine.class);
//        washingMachine.setId(120);
//        washingMachine.setBrandName("LG");
//        washingMachine.setPrice(67899.99);
        System.out.println(washingMachine);
    }
}
