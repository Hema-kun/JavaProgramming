package com.dicoding.javafundamental.PZN.JavaOOP.Data;

public class Avanza implements Car{

    @Override
    public void drive() {
        System.out.println("Avanza");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
