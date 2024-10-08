package com.dicoding.javafundamental.PZN.JavaOOP.Data;

public class Avanza implements Car{

    @Override
    public void drive() {

    }

    @Override
    public int getTire() {
        return 0;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
