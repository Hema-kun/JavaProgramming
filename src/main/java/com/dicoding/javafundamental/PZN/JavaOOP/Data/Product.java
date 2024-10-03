package com.dicoding.javafundamental.PZN.JavaOOP.Data;

public class Product {

    public String name;
    protected int price;

    public Product(String name, int Price){
        this.name = name;
        this.price = Price;
    }

    public void print(){
        System.out.println("Ini Product");
    }
}
