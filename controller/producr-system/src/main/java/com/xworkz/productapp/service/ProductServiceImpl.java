package com.xworkz.productapp.service;

import com.xworkz.productapp.dto.ProductDto;
import com.xworkz.productapp.entity.ProductEntity;
import com.xworkz.productapp.repository.ProductRepository;
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
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;
    @Override
    public Boolean validateAndSave(ProductDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<ProductDto>> validate = validator.validate(dto);
        if (!validate.isEmpty()) {
            validate.stream().forEach(error -> System.out.println(error.getMessage()));
        } else {
            ProductEntity entity = new ProductEntity();
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
