package com.dicoding.javafundamental.Dasar1PZN;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "heru";

        System.out.println(name);

        int age = 24;
        String address = "indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "heru purnama";
        System.out.println(name);

        //Penggunaan var khusus jdk-10;
        //var name = "heru";

        //final lastname = "heru";
        //lastname = "purnama"; fail

    }
}
