package com.dicoding.javafundamental.PZN.JavaOOP.Data;

public class Application {

    public static final int PROCESSOR;
    static {
        System.out.println("Akses class Application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
