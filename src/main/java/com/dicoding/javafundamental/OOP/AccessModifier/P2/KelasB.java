package com.dicoding.javafundamental.OOP.AccessModifier.P2;

import com.dicoding.javafundamental.OOP.AccessModifier.P1.KelasA;

public class KelasB extends KelasA {

    //satu-satunya cara untuk akses dari luar package adalah kelas yang hendak mengakses, merupakan kelas turunannya.
    @Override
    protected void methodC(){
        super.methodC();

        System.out.println("Contoh pemanggilan method dari package luar");
    }
}
