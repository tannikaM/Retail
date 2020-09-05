package com.retail.Entity;

public class Product {
    private String id;
    private String name;

    private Price currentPrice;

    public Product(String id, String name, Price currentPrice){
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public String getId(){
        return  this.id;
    }

    public String getName(){
        return this.name;
    }

    public Price getCurrentPrice(){
        return this.currentPrice;
    }
}
