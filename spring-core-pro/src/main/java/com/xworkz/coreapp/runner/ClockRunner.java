package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Clock;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClockRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Clock clock = applicationContext.getBean(Clock.class);
//        clock.setId(87);
//        clock.setBrandName("WallClock");
//        clock.setPrice(2800.90);
        System.out.println(clock);

    }
}
