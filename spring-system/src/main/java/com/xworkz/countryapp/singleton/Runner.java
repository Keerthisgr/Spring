package com.xworkz.countryapp.singleton;

import com.xworkz.countryapp.util.PersonUtil;

public class Runner {
    public static void main(String[] args) {
        Person person = PersonUtil.getPerson();
        person.setId(1);
        person.setName("Keerthi");
        person.setPhoneNo(876543223l);
        person.setEmail("keer@gmail.com");

        Person person1 = PersonUtil.getPerson();
        person1.setId(7);
        person1.setName("Kiran");
        person1.setPhoneNo(9876543212l);
        person1.setEmail("kiran@gmail.com");


        System.out.println(person);
        System.out.println(person1);
    }
}
