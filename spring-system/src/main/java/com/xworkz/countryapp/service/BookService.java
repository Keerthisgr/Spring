package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.entity.BookEntity;

import java.util.List;

public interface BookService {
    Boolean validateAndSave(BookDto bookDto);
    BookEntity getById(Integer id);
    BookEntity getByName(String bookName);
    Integer updateByName(String bookName, String authorName);
    Integer deleteById(Integer id);
    Integer updateBookAndAuthorNameByName(String authorName, String bookName, Integer id);
    BookEntity getByAuthorName(String authorName);
    public List<BookDto> getAllData();
}
