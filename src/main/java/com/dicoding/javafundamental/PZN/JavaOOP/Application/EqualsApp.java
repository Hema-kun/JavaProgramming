package com.dicoding.javafundamental.PZN.JavaOOP.Application;

public class EqualsApp {

    public static void main(String[] args) {

        String first = "Heru";
        first = first + " " + "Purnama";

        System.out.println(first);

        String second = "Heru Purnama";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first == first);
        System.out.println(first.equals(second));

    }
}
