package com.dicoding.javafundamental.PZN.JavaLambda.App;

import java.util.function.Predicate;

public class PredicateApp {

    public static void main(String[] args) {

        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        } ;

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test(" "));
        System.out.println(predicateCheckBlank.test("Heru"));
    }
}
