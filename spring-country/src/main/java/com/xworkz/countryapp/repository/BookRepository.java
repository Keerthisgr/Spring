package com.xworkz.countryapp.repository;

import com.xworkz.countryapp.entity.BookEntity;
import com.xworkz.countryapp.entity.CountryEntity;

public interface BookRepository {
    boolean save(BookEntity bookEntity);
}
