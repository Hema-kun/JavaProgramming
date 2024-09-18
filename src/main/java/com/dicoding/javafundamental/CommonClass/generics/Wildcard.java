package com.dicoding.javafundamental.CommonClass.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {

        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        System.out.println(ls); // Apakah baris ini valid?

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        System.out.println(cp); // Apakah baris ini valid?
    }

    public static void print(Collection<?> collection){
        for(Object o : collection){
            System.out.println(0);
        }
    }
}
