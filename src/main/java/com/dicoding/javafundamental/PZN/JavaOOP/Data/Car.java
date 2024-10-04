package com.dicoding.javafundamental.PZN.JavaOOP.Data;

public interface Car extends HasBrand, IsMaintenance {

    //interface = public
    void drive();

    int getTire();

    default boolean isBig(){
      return false;
    };
}
