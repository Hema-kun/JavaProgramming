package com.dicoding.javafundamental.PZN.JavaStandardClasses;

public class NumberApp {

    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        String contoh = "10000";

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);

        int contohInt2 = Integer.parseInt(contoh);
    }
}
