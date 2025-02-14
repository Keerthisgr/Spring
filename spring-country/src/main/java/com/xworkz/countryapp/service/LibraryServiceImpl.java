package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.LibraryDto;
import com.xworkz.countryapp.dto.SmartWatchDto;
import com.xworkz.countryapp.entity.LibraryEntity;
import com.xworkz.countryapp.entity.SmartWatchEntity;
import com.xworkz.countryapp.repository.LibraryRepository;
import com.xworkz.countryapp.repository.LibraryRepositoryImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class LibraryServiceImpl implements LibraryService{
    @Autowired
    LibraryRepositoryImpl repository;
    @Override
    public Boolean validateAndSave(LibraryDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<LibraryDto>> validate = validator.validate(dto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            LibraryEntity entity = new LibraryEntity();
            try {
                BeanUtils.copyProperties(dto, entity);
                repository.save(entity);
                isSaved = true;
                System.out.println(entity);
            } catch (BeansException e) {
                System.out.println(e.getMessage());
            }
        } else {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        }
        return isSaved;
    }
}
