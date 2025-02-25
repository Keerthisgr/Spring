package com.xworkz.consumerapp.service;

import com.xworkz.consumerapp.dto.ConsumerDto;
import com.xworkz.consumerapp.entity.ConsumerEntity;
import com.xworkz.consumerapp.repository.ConsumerRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

@Service
public class ConsumerServiceImpl implements ConsumerService{
   @Autowired
   ConsumerRepository consumerRepository;
    @Override
    public Boolean validateAndSave(ConsumerDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<ConsumerDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            ConsumerEntity entity = new ConsumerEntity();
            try {
                BeanUtils.copyProperties(entity, dto);
                System.out.println(entity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            consumerRepository.save(entity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }
}
