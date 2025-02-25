package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        BookDto bookDto = new BookDto();
//        bookDto.setBookName("Ramayana");
//        bookDto.setAuthorName("Valmiki");
//        bookDto.setPrice(977.90);
//        bookService.validateAndSave(bookDto);
//        bookService.getById(4);
//        bookService.getByName("Ramayana");
//        bookService.updateByName("Atomic Habits","SudhaMurthy");
//        bookService.deleteById(5);
        bookService.updateBookAndAuthorNameByName("James","Ikegai",4);
        bookService.getByAuthorName("Sadhguru");
    }
}
