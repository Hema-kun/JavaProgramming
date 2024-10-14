package com.dicoding.javafundamental.PZN.JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableAPp {

    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Heru");
        mutable.add("Purnama");
        List<String> imutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Heru", "purnama");

        for(var value : mutable){
            System.out.println(value);
        }

    }
}
