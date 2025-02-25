package com.xworkz.bookapp.repository;

import com.xworkz.bookapp.entity.BookEntity;

public interface BookRepository {
    Boolean save(BookEntity entity);

}
