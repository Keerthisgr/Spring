package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Chain;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChainRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Chain chain = applicationContext.getBean(Chain.class);
//        chain.setId(67);
//        chain.setMetalName("Gold");
//        chain.setPrice(9876.90);
        System.out.println(chain);

    }
}
