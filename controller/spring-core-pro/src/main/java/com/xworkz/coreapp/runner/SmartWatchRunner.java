package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.SmartWatch;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class SmartWatchRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        SmartWatch smartWatch = applicationContext.getBean(SmartWatch.class);
//        smartWatch.setId(45);
//        smartWatch.setBrandName("Noise");
//        smartWatch.setModelName("NoiseM89");
//        smartWatch.setPrice(5678.90);
        System.out.println(smartWatch);
    }
}
