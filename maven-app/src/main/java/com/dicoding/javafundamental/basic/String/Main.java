package com.dicoding.javafundamental.basic.String;

public class Main {

    public static void main(String[] args) {

        String greeting = "Hello";
        System.out.println(greeting);

        char[] dicodingChars = {'H','E','R','U'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

        int length = dicodingString.length();
        System.out.println(length);

        char result = dicodingString.charAt(1);
        System.out.println(result);
        boolean isEmpty = dicodingString.isEmpty();
        boolean isBlank = dicodingString.isBlank();
        System.out.println(isEmpty +" "+ isBlank);
    }
}
