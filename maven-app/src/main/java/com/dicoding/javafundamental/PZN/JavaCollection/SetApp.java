package com.dicoding.javafundamental.PZN.JavaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {

        Set<String> names =  new HashSet<>();
        names.add("Heru");
        names.add("Purnama");
        names.add("Purnama");
        names.add("Heru");
        names.add("Purnama");
        names.add("Heru");
        names.add("Purnama");
        names.add("Oke");
        names.add("Heru");
        names.add("Purnama");
        names.add("Oke");


        for(var value : names){
            System.out.println(value);
        }

        Set<String> names1 = new LinkedHashSet<>();
        names1.add("1");
        names1.add("1");
        names1.add("2");
        names1.add("2");
        names1.add("3");
        names1.add("1");
        names1.add("2");
        names1.add("2");

        for(var value2 : names1){
            System.out.println(value2);
        }

    }
}
