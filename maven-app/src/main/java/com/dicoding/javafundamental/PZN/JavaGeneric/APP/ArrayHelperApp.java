package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {

        String[] names = {"Heru", "Purnama"};
        Integer[] number = {1,2,3,4,5};

        System.out.println(

                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(number)
        );
    }
}
