package com.dicoding.javafundamental.PZN.JavaStandardClasses;

import java.util.Arrays;

public class ArraysApp {

    public static void main(String[] args) {

        int[] numbers = {
                1,2,3,4,5,1,2,3,4,5
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 5));

        int[] result = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(result));
    }
}
