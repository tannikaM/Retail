package com.retail.controllers;

import com.retail.Entity.Price;
import com.retail.Entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/products")
public class RetailController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public Product FetchDetail(@PathVariable String id) {
        Price currentPrice = new Price(10.00, "INR");
        Product product =  new Product(id, "abc", currentPrice);



        return product;
    }

}
