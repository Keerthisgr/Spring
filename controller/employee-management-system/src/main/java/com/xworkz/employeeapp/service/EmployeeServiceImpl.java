package com.xworkz.employeeapp.service;

import com.xworkz.employeeapp.dto.EmployeeDto;
import com.xworkz.employeeapp.entity.EmployeeEntity;
import com.xworkz.employeeapp.repository.EmployeeRepository;
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
public class EmployeeServiceImpl implements EmployeeService{
   @Autowired
    EmployeeRepository repository;
    @Override
    public Boolean validateAndSave(EmployeeDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<EmployeeDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            EmployeeEntity entity = new EmployeeEntity();
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
