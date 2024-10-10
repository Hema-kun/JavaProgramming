package com.dicoding.javafundamental.PZN.JavaLambda.App;

import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Heru Purnama";

        System.out.println(supplier.get());
    }
}
