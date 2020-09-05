package com.retail;

import com.retail.controllers.RetailController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = RetailController.class)
public class Retail {
    public static void main(String[] args) {
        SpringApplication.run(Retail.class, args);
    }
}