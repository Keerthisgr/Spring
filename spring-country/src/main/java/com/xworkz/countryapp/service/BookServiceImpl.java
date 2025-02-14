package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.entity.BookEntity;
import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.repository.BookRepositoryImpl;
import com.xworkz.countryapp.repository.CountryRepositoryImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
@Component
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepositoryImpl bookRepository;
    @Override
    public Boolean validateAndSave(BookDto bookDto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<BookDto>> validate = validator.validate(bookDto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            BookEntity bookEntity = new BookEntity();
            try {
                BeanUtils.copyProperties(bookDto, bookEntity);
                bookRepository.save(bookEntity);
                isSaved = true;
                System.out.println(bookEntity);
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }
        } else {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        }
        return isSaved;
    }
}
