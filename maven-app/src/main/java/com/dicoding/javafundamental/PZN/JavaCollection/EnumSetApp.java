package com.dicoding.javafundamental.PZN.JavaCollection;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender{
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

        EnumSet<Gender> genders1 = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for(var gender : genders){
            System.out.println(gender);
        };
    }
}
