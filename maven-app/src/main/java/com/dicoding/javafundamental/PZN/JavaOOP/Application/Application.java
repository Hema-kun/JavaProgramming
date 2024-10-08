package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.Product;
import com.dicoding.javafundamental.PZN.JavaOOP.Data.ProductApp;

public class Application {

    public static void main(String[] args) {

        var product = new Product("Laptop", 2000);
        System.out.println(product.name);

        product.print();

        var product1 = new ProductApp();
        product1.getText("Oke");
    }
}
