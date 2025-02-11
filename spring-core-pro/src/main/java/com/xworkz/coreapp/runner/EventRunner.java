package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Event;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Event event = applicationContext.getBean(Event.class);
//        event.setEventId(101);
//        event.setEventType("Holiday");
//        event.setWho("Keerthi");
        System.out.println(event);
    }
}
