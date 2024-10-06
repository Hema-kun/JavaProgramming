package com.dicoding.javafundamental.PZN.JavaStandardClasses;

public class StringTokenizer {

    public static void main(String[] args) {

        String value = "Heru Purnama";

        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
