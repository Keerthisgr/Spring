package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.BookEntity;

import java.util.List;

public interface BookRepository {
    boolean save(BookEntity bookEntity);
    BookEntity getById(Integer id);
    BookEntity getByName(String bookName);

    Integer updateByName(String bookName, String authorName);

    Integer deleteById(Integer id);

    Integer updateBookAndAuthorById(String authorName, String bookName, Integer id);
    BookEntity getByAuthorName(String authorName);

    List<BookEntity> getAllData();
}
