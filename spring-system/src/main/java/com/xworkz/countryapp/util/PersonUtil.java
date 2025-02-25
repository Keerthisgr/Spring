package com.xworkz.countryapp.util;

import com.xworkz.countryapp.singleton.Person;

public class PersonUtil {
    private static Person person = null;

    public  static  Person getPerson(){
        return person;
    }
    static {
        person = new Person();
    }
}
