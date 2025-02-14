package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.MobileDto;
import com.xworkz.countryapp.dto.SmartWatchDto;
import com.xworkz.countryapp.entity.MobileEntity;
import com.xworkz.countryapp.entity.SmartWatchEntity;
import com.xworkz.countryapp.repository.SmartWatchRepository;
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
public class SmartWatchServiceImpl implements SmartWatchService{
    @Autowired
    SmartWatchRepository repository;
    @Override
    public Boolean validateAndSave(SmartWatchDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<SmartWatchDto>> validate = validator.validate(dto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            SmartWatchEntity entity = new SmartWatchEntity();
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
