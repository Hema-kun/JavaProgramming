package com.dicoding.javafundamental.PZN.JavaStandardClasses;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {

        Random random = new Random();

        for(int i = 0 ; i < 5 ; i++){

            int value = random.nextInt(100);
            System.out.println(value);
        }
    }
}
