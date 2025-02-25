package com.xworkz.bookapp.service;

import com.xworkz.bookapp.dto.BookDto;
import com.xworkz.bookapp.entity.BookEntity;
import com.xworkz.bookapp.repository.BookRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.awt.print.Book;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository repo;
    @Override
    public Boolean validateAndSave(BookDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<BookDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            BookEntity entity = new BookEntity();
            try {
                BeanUtils.copyProperties(entity, dto);
                System.out.println(entity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            repo.save(entity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }
}
