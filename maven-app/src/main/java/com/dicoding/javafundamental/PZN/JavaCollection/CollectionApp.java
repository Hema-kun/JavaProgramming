package com.dicoding.javafundamental.PZN.JavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("heru");
        collection.add("Purnama");
        collection.addAll(List.of("Programmer","Now"));

        for(var value : collection){
            System.out.println(value);
        }

        System.out.println("Remove");

        collection.remove("Purnama");
        collection.removeAll(List.of("Programmer","Now"));

        for(var value : collection){
            System.out.println(value);
        }

        System.out.println(collection.contains("heru"));
        System.out.println(collection.contains("purnama"));
        System.out.println(collection.size());
    }
}
