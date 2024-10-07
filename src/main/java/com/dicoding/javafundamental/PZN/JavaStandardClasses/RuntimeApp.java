package com.dicoding.javafundamental.PZN.JavaStandardClasses;

public class RuntimeApp {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime());
        System.gc();

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.availableProcessors());

    }
}
