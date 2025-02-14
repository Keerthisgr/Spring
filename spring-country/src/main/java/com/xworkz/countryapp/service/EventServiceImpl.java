package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.EventDto;
import com.xworkz.countryapp.dto.InstituteDto;
import com.xworkz.countryapp.entity.EventEntity;
import com.xworkz.countryapp.entity.InstituteEntity;
import com.xworkz.countryapp.repository.EventRepository;
import com.xworkz.countryapp.repository.EventRepositoryImpl;
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
public class EventServiceImpl implements EventService{
    @Autowired
    EventRepositoryImpl repository;
    @Override
    public Boolean validateAndSave(EventDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<EventDto>> validate = validator.validate(dto);
        boolean isSaved = false;
        if (validate.isEmpty()) {
            EventEntity entity = new EventEntity();
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
