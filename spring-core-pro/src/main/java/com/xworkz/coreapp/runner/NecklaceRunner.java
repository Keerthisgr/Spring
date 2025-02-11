package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Necklace;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NecklaceRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Necklace necklace = applicationContext.getBean(Necklace.class);
//        necklace.setId(765);
//        necklace.setMetalName("Gold");
//        necklace.setPrice(98765.90);
        System.out.println(necklace);

    }
}
