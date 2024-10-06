package com.dicoding.javafundamental.PZN.JavaStandardClasses;

import java.util.StringJoiner;

public class StringJoinerAPp {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",","[","]");

        joiner.add("Heru");
        joiner.add("Purnama");

        String value = joiner.toString();
        System.out.println(value);
    }
}
