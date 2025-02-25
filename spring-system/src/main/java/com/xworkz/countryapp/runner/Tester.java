package com.xworkz.countryapp.runner;

import com.xworkz.countryapp.dto.BookDto;

public class Tester {
    public static void main(String[] args) {



        BookDto book1 = new BookDto();
        book1.setId(4);
        book1.setBookName("jghtgf");
        book1.setAuthorName("kjuhjhgf");
        book1.setPrice(476.89);
        System.out.println(book1);

        BookDto book = book1;
        System.out.println(book);


    }
}
