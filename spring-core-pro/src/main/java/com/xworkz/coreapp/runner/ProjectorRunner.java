package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Projector;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectorRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Projector projector = applicationContext.getBean(Projector.class);
//        projector.setId(654);
//        projector.setBrandName("Xewoh");
//        projector.setType("Electronic Gadgets");
//        projector.setPrice(87654.90);
        System.out.println(projector);
    }
}
