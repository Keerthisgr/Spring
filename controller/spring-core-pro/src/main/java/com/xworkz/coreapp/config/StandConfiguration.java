package com.xworkz.coreapp.config;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.coreapp.bean.TShirt;
import com.xworkz.coreapp.bean.Telivision;
import com.xworkz.coreapp.bean.WashingMachine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.coreapp")
public class StandConfiguration {
//    public StandConfiguration(){
//        System.out.println("Object");
//    }
    @Bean
    public TShirt getTShirt(){
        TShirt ref = new TShirt();
        return ref;
    }
@Bean
    public String getString(){
        String string = new String();
        return "Baba";
    }

    @Bean("myString")
    public String getStringValue(){
        String string = new String();
        return "Babi";
    }
    @Bean
    public int getInt(){
        return 89;
    }

    @Bean
    public long getLong(){
        return 9876543210l;
    }

    @Bean
    public byte getByte(){
        return 3;
    }

    @Bean
    public short getShort(){
        return 4;
    }

    @Bean
    public float getFloat(){
        return 4.5f;
    }

    @Bean
    public double getDouble(){
        return 6.8;
    }

    @Bean
    public Character getChar(){
        return 'r';
    }

    @Bean
    public Boolean getBoolean(){
        return true;
    }

    @Bean
    public List getList(){
        return new ArrayList();
    }

    @Bean("myList")
    public List<Telivision> getData(){
        return new ArrayList<Telivision>();
    }

    @Bean
    public List<WashingMachine> getValue(){
        return new ArrayList<WashingMachine>();
    }
}
