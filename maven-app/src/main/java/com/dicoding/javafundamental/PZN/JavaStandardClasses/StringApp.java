package com.dicoding.javafundamental.PZN.JavaStandardClasses;

public class StringApp {

    public static void main(String[] args) {

        String name = "Heru Purnama";

        String nameLowerCase = name.toLowerCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.startsWith("Heru"));

        //Memotong
        String[] names = name.split(" ");
        for(var value : names){
            System.out.println(value);
        }

        name = "Heru";
        System.out.println(name.isBlank()&&name.isEmpty());

        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
        System.out.println(chars);
    }

}
