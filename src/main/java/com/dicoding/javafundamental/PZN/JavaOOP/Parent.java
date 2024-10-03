package com.dicoding.javafundamental.PZN.JavaOOP;

public class Parent {

    String name;

    void doIt(){
        System.out.println("Do it");
    }
}

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("Do it Child");
    }
}
