package com.xworkz.coreapp.runner;

import com.sun.org.apache.xerces.internal.xs.StringList;
import com.xworkz.coreapp.bean.TShirt;
import com.xworkz.coreapp.bean.Telivision;
import com.xworkz.coreapp.bean.WashingMachine;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TShirtRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        TShirt tShirt = applicationContext.getBean(TShirt.class);
//        tShirt.setId(45);
//        tShirt.setBrandName("Puma");
//        tShirt.setPrice(449.99);
        System.out.println(tShirt);

        String string = applicationContext.getBean("myString",String.class);
        System.out.println(string);

        String string1 = applicationContext.getBean("getString",String.class);
        System.out.println(string1);

        Integer integer = applicationContext.getBean(Integer.class);
        System.out.println(integer);

        Long aLong = applicationContext.getBean(Long.class);
        System.out.println(aLong);

        Byte aByte = applicationContext.getBean(Byte.class);
        System.out.println(aByte);

        Short aShort = applicationContext.getBean(Short.class);
        System.out.println(aShort);

        Float aFloat = applicationContext.getBean(Float.class);
        System.out.println(aFloat);

        Double aDouble = applicationContext.getBean(Double.class);
        System.out.println(aDouble);

        Character character = applicationContext.getBean(Character.class);
        System.out.println(character);

        Boolean aBoolean = applicationContext.getBean(Boolean.class);
        System.out.println(aBoolean);

//        List list = applicationContext.getBean(List.class);
//        list.add(45);
//        System.out.println(list);

        List<Telivision> telivisions = applicationContext.getBean("myList",List.class);
        telivisions.add(new Telivision(2,"Sony",89000.90));
        System.out.println(telivisions);

        List<WashingMachine> wash = applicationContext.getBean("getValue",List.class);
        wash.add(new WashingMachine(2,"LG",89000.90));
        System.out.println(wash);







    }
}
