package com.xworkz.diapp.runner;

import com.xworkz.diapp.config.SpringConfiguration;
import com.xworkz.diapp.dependent.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Patient patient = applicationContext.getBean(Patient.class);
        System.out.println(patient);
        System.out.println("************************");
        Library library = applicationContext.getBean(Library.class);
        System.out.println(library);
        System.out.println("*****************************");
        Husband husband = applicationContext.getBean(Husband.class);
        System.out.println(husband);
        System.out.println("**************************");
        Mobile mobile = applicationContext.getBean(Mobile.class);
        System.out.println(mobile);
        System.out.println("***************************");
        Telivision telivision = applicationContext.getBean(Telivision.class);
        System.out.println(telivision);
        System.out.println("***************************");
        Laptop laptop = applicationContext.getBean(Laptop.class);
        System.out.println(laptop);
        System.out.println("*********************************");
        House house = applicationContext.getBean(House.class);
        System.out.println(house);
        System.out.println("*************************");
        Dish dish = applicationContext.getBean(Dish.class);
        System.out.println(dish);
        System.out.println("**************************");
        Theatre theatre = applicationContext.getBean(Theatre.class);
        System.out.println(theatre);
        System.out.println("***************************");
        Song song = applicationContext.getBean(Song.class);
        System.out.println(song);
        System.out.println("************************");
        MedicalShop medicalShop = applicationContext.getBean(MedicalShop.class);
        System.out.println(medicalShop);
        System.out.println("*****************************");
        Computer computer = applicationContext.getBean(Computer.class);
        System.out.println(computer);
        System.out.println("************************");
        Bank bank = applicationContext.getBean(Bank.class);
        System.out.println(bank);
        System.out.println("**************************");
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);
        System.out.println("*******************************");
        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        System.out.println(restaurant);
        System.out.println("****************************");
        Train train = applicationContext.getBean(Train.class);
        System.out.println(train);
        System.out.println("*****************************");
        Ecommerce ecommerce = applicationContext.getBean(Ecommerce.class);
        System.out.println(ecommerce);
        System.out.println("************************************");
        Document document = applicationContext.getBean(Document.class);
        System.out.println(document);
        System.out.println("*********************************");
        Game game = applicationContext.getBean(Game.class);
        System.out.println(game);
        System.out.println("*******************************");
    }
}
