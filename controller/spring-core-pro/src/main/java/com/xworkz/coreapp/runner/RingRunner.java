package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Ring;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RingRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Ring ring = applicationContext.getBean(Ring.class);
//        ring.setId(876);
//        ring.setMaterialType("Metal");
//        ring.setMetalType("Yellow Gold");
//        ring.setPrice(9876.99);
        System.out.println(ring);
    }
}
