package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Bag;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BagRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Bag bag = applicationContext.getBean(Bag.class);
//        bag.setId(87);
//        bag.setBrandName("Warrior");
//        bag.setNoOfZip(5);
//        bag.setPrice(876.90);
        System.out.println(bag);
    }
}
