package com.dicoding.javafundamental.PZN.JavaStandardClasses;

public class StringBuilderApp {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Heru");
        builder.append(" ");
        builder.append("Purnama");

        String name = builder.toString();
        System.out.println(name);
    }
}
