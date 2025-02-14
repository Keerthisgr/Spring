package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.service.BookService;
import com.xworkz.countryapp.service.CountryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        BookDto bookDto = new BookDto();
        bookDto.setBookName("Atomic habit");
        bookDto.setAuthorName("James clerk");
        bookDto.setPrice(9877.90);
        bookService.validateAndSave(bookDto);

    }
}
