package com.dicoding.javafundamental.PZN.JavaStandardClasses;

import java.util.Base64;

public class Base65App {

    public static void main(String[] args) {

        String original = "Heru Purnama";

        String encode = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String result = new String(bytes);
        System.out.println(result);
    }
}
