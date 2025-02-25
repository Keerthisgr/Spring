package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Table;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TableRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Table table = applicationContext.getBean(Table.class);
//        table.setId(87);
//        table.setBrandName("Usha");
//        table.setPrice(2239.90);
        System.out.println(table);
    }
}
