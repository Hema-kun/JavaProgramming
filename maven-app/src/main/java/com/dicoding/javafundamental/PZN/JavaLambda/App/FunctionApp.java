package com.dicoding.javafundamental.PZN.JavaLambda.App;

import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {

        Function<String, Integer> functionLength = s -> s.length();

        System.out.println(functionLength.apply("Heru"));
    }
}
