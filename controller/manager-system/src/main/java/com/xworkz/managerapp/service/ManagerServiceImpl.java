package com.xworkz.managerapp.service;

import com.xworkz.managerapp.dto.ManagerDto;
import com.xworkz.managerapp.entity.ManagerEntity;
import com.xworkz.managerapp.repository.ManagerRepository;
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
public class ManagerServiceImpl implements ManagerService{
   @Autowired
   ManagerRepository repository;
    @Override
    public Boolean validateAndSave(ManagerDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<ManagerDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            ManagerEntity entity = new ManagerEntity();
            try {
                BeanUtils.copyProperties(entity, dto);
                System.out.println(entity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            repository.save(entity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }
}
