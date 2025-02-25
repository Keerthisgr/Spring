package com.xworkz.customerapp.service;

import com.xworkz.customerapp.dto.CustomerDto;
import com.xworkz.customerapp.entity.CustomerEntity;
import com.xworkz.customerapp.repository.CustomerRepository;
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
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Boolean validateAndSave(CustomerDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<CustomerDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            CustomerEntity customerEntity = new CustomerEntity();
            try {
                BeanUtils.copyProperties(customerEntity, dto);
                System.out.println(customerEntity);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
            }
            customerRepository.save(customerEntity);
            System.out.println("All fields are validated and saved");
        }
        return null;
    }
}
