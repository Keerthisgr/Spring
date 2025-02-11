package com.xworkz.coreapp.config;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.coreapp")
public class StandConfiguration {
    public StandConfiguration(){
        System.out.println("Object");
    }
}
