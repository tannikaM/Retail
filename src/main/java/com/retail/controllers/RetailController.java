package com.retail.controllers;

import com.retail.Entity.Price;
import com.retail.Entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping (value = "/{id}", produces = "application/json")
    public void UpdateDetail(@PathVariable String id) {

    }

}
