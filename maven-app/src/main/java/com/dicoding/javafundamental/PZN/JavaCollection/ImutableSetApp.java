package com.dicoding.javafundamental.PZN.JavaCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {

    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Heru");

        Set<String> mutable = new HashSet<>();
        mutable.add("Heru");
        mutable.add("Purnama");
        Set<String > imutable = Collections.unmodifiableSet(mutable);

        //Otomatis
        Set<String> set = Set.of("Heru","Purnama");
        //set.remove("Heru");

       // set.add("heru");
    }
}
