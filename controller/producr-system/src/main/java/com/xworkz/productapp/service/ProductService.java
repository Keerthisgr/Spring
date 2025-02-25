package com.xworkz.productapp.service;


import com.xworkz.productapp.dto.ProductDto;

public interface ProductService {
    Boolean validateAndSave(ProductDto dto);

}
