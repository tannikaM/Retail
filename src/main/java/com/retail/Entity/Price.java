package com.retail.Entity;

public class Price {
    private Double value;
    private String countryCode;

    public Price(Double value, String countryCode){
        this.countryCode = countryCode;
        this.value = value;
    }

    public Double getValue(){
        return this.value;
    }

    public String getCountryCode(){
        return this.countryCode;
    }

}
