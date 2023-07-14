package com.company.oop.cosmetics.models;

import java.util.ArrayList;

public class Category {

    private String name;
    private ArrayList<Product> products;
    public static final int NAME_MIN_LENGTH = 2;
    public static final int NAME_MAX_LENGTH = 15;

    public Category(String name) {
        setName(name);
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name){
        if(name.length()>=NAME_MIN_LENGTH && name.length() <= NAME_MAX_LENGTH ){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should be between 2 and 15 symbols.");
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
        //throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void addProduct(Product product) {
        products.add(product);
        //throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void removeProduct(Product product) {
        if(products.remove(product)) {
        }
        else {
            throw new IllegalArgumentException("Product not found in category");
        }
    }
    
    public String print() {
        System.out.printf("#Category: {%s}", name);
        for (Product product: products) {
            System.out.printf("#{%s}: {%s}\n", product.getName(),product.getBrand());
            System.out.printf("#Price: {%.2f}\n", product.getPrice());
            System.out.printf("#Gender: {%s}\n", product.getGender());
            System.out.println("===");
        }
        return print();
    }


    
}
