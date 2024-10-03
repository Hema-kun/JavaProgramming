package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.Avanza;

public class CarApp {

    public static void main(String[] args) {

        var car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
