package com.dicoding.javafundamental.PZN.JavaOOP.Data;

public class ProductApp {

    public static void main(String[] args) {

        var product = new Product("Macbook", 2000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        var product2 = new Product("Macbook", 2000);

        System.out.println(product.equals(product2));

        System.out.println(product.hashCode() == product2.hashCode());
    }

    public void getText(String name){
        System.out.println("Ini text" + name);
    }


}
