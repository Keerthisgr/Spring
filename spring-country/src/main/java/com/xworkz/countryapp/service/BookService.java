package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.dto.CountryDto;

public interface BookService {
    Boolean validateAndSave(BookDto bookDto);
}
