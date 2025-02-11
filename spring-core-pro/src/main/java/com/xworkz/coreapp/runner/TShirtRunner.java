package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.TShirt;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TShirtRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        TShirt tShirt = applicationContext.getBean(TShirt.class);
//        tShirt.setId(45);
//        tShirt.setBrandName("Puma");
//        tShirt.setPrice(449.99);
        System.out.println(tShirt);
    }
}
