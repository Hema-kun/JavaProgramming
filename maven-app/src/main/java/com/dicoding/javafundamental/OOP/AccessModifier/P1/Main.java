package com.dicoding.javafundamental.OOP.AccessModifier.P1;

public class Main {
    public static void main(String[] args) {

        KelasA kelasA = new KelasA();

        //Dibawah karena mengakses private atribut/method
        //System.out.println(kelasA.memberA);
        //System.out.println(kelasA.functionA());
        System.out.println(kelasA.functionB());

        //Akses ke default atribut/method
        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    }
}
