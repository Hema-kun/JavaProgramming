package com.dicoding.javafundamental.PZN.JavaLambda.App;

import com.dicoding.javafundamental.PZN.JavaLambda.SimpleAction;

public class SimpleActionApp {

    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Heru";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Heru"));
//
//        SimpleAction simpleAction2  = (String name) -> {
//
//            return "Purnama";
//        };
//
//        System.out.println(simpleAction2.action("Purnama"));

        //Versi dengan paramter
        SimpleAction simpleAction1 = (String value) ->{
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        System.out.println(simpleAction2.action("Purnama"));

        //versi tanpa blok kode

        SimpleAction simpleAction3 = (String name2) -> "Hello" + name2;
    }
}
