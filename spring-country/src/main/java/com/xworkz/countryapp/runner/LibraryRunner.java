package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.LaptopDto;
import com.xworkz.countryapp.dto.LibraryDto;
import com.xworkz.countryapp.service.LaptopService;
import com.xworkz.countryapp.service.LibraryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        LibraryService service = applicationContext.getBean(LibraryService.class);
        LibraryDto dto = new LibraryDto();
        dto.setName("Sharavathi");
        dto.setType("Private");
        dto.setNoOfBooks(4567);
        service.validateAndSave(dto);
    }
}
