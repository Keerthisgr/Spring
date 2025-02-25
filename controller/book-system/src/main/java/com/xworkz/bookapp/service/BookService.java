package com.xworkz.bookapp.service;

import com.xworkz.bookapp.dto.BookDto;

public interface BookService {
    Boolean validateAndSave(BookDto dto);

}
