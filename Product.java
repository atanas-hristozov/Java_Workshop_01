package com.company.oop.cosmetics.models;

import java.util.Objects;

public class Product {
    private String name;
    private String brand;
    private double price;
    private GenderType gender;

    private static final int NAME_MIN_LENGTH = 3;
    private static final int NAME_MAX_LENGTH = 10;
    private static final int BRAND_MIN_LENGTH = 2;
    private static final int BRAND_MAX_LENGTH = 10;

    // "Each product in the system has name, brand, price and gender."

    public Product(String name, String brand, double price, GenderType gender) {
        // finish the constructor and validate data
        setName(name);
        setBrand(brand);
        setPrice(price);
        setGender(gender);
    }

    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price should be non negative.");
        }
        //throw new UnsupportedOperationException("Not implemented yet.");
    }

    public double getPrice() {
        return price;
        //throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void setName(String name){
        if(name.length() >= NAME_MIN_LENGTH && name.length() <= NAME_MAX_LENGTH){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should be between 3 and 10 symbols.");
        }
    }
    public String getName() {
        return name;
        //throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void setBrand(String brand){
        if(brand.length() >= BRAND_MIN_LENGTH && brand.length() <= BRAND_MAX_LENGTH){
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Brand should be between 2 and 10 symbols.");
        }
    }
    public String getBrand() {
        return brand;
        //throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void setGender(GenderType gender){
        if (gender.equals(gender.MEN)){
            this.gender = gender;
        } else if (gender.equals(gender.WOMEN)){
            this.gender = gender;
        } else {
            this.gender = gender.UNISEX;
        }
    }
    public GenderType getGender() {
        return gender;
        //throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String print() {
        StringBuilder print = new StringBuilder();
        print.append(String.format("Format:\n #[%s] [%s] \n #Price: [%d] \n #Gender: [%s] \n ===", name, brand, price, gender));
        return print.toString();
        //throw new UnsupportedOperationException("Not implemented yet.");
        // Format:
        //" #[Name] [Brand]
        // #Price: [Price]
        // #Gender: [Gender]
        // ==="
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Product product = (Product) p;
        return Double.compare(this.getPrice(), product.getPrice()) == 0 &&
                Objects.equals(this.getName(), product.getName()) &&
                Objects.equals(this.getBrand(), product.getBrand()) &&
                this.getGender() == product.getGender();
    }
    
}
