package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.Category;

public class CategoryApp {

    public static void main(String[] args) {

        var categori = new Category();

        categori.setId("ID");
        categori.setId(null);

        System.out.println(categori.getId());
    }
}
