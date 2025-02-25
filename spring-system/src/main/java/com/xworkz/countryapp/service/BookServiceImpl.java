package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.BookDto;
import com.xworkz.countryapp.entity.BookEntity;
import com.xworkz.countryapp.repository.BookRepositoryImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
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

    @Override
    public BookEntity getById(Integer id) {
            BookEntity bookEntity = bookRepository.getById(id);
            if (bookEntity != null) {
                System.out.println("Book id found\n" + bookEntity);
            }
            else {
                System.out.println("Book id not found");
            }
            return bookEntity;
    }

    @Override
    public BookEntity getByName(String bookName) {
        BookEntity bookEntity = bookRepository.getByName(bookName);
        if (bookEntity != null) {
            System.out.println("Book name found\n" + bookEntity);
        }
        else {
            System.out.println("Book name not found");
        }
        return bookEntity;
    }

    @Override
    public Integer updateByName(String bookName, String authorName) {
        int rows=bookRepository.updateByName(bookName, authorName);
        if (rows>0){
            System.out.println("author name is updated");
        }else {
            System.out.println("author name not updated");
  }return 0;
    }

    @Override
    public Integer deleteById(Integer id) {
        int rows = bookRepository.deleteById(id);
        if (rows > 0) {
            System.out.println("Book with ID " + id + " is deleted");
        } else {
            System.out.println("Book with ID " + id + " not found or not deleted");
        }
        return rows;
    }

    @Override
    public Integer updateBookAndAuthorNameByName(String authorName, String bookName, Integer id) {
        int rows=bookRepository.updateBookAndAuthorById(authorName, bookName,id);
        if (rows>0){
            System.out.println("author and book name is updated");
        }else {
            System.out.println("author and book name not updated");
        }return 0;
    }

    @Override
    public BookEntity getByAuthorName(String authorName) {
        BookEntity bookEntity = bookRepository.getByName(authorName);
        if (bookEntity != null) {
            System.out.println("Author name found\n" + bookEntity);
        }
        else {
            System.out.println("Author name not found");
        }
        return bookEntity;
    }
    @Override
    public List<BookDto> getAllData() {
        List<BookEntity> entities=bookRepository.getAllData();
        List<BookDto> bookDtos =new ArrayList<>();
        if (entities != null) {
            for (BookEntity entity : entities) {
                BookDto dto = new BookDto();
                    BeanUtils.copyProperties(dto,entity);
                    System.out.println(bookDtos);

                bookDtos.add(dto);
            }
        }
        return bookDtos;
    }
}


