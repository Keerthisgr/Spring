package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Chair;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChairRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Chair chair = applicationContext.getBean(Chair.class);
        chair.setId(1);
        chair.setBrandName("Usha");
        chair.setPrice(6789.90);
        System.out.println(chair);

        Chair chair1 = applicationContext.getBean(Chair.class);

        chair1.setId(2);
        chair1.setBrandName("Meme");
        chair1.setPrice(789.90);
        System.out.println(chair1);

    }
}
