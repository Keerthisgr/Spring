package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.bean.Product;
import com.xworkz.coreapp.config.StandConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StandConfiguration.class);
        Product product = applicationContext.getBean(Product.class);
        product.setProductId(234);
        product.setProductName("Smartphone");
        product.setCategory("Electronic gadgets");
        product.setPrice(12345.90);
        System.out.println(product);

    }
}
