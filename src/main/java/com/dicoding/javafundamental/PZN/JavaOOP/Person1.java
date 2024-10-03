package com.dicoding.javafundamental.PZN.JavaOOP;

public class Person1 {

    String name;
    String address;
    final String country = "Indonesia";

    //constructor adalah method yg akan dipanggil ketika pertama kali object dibuat
    Person1(String paramName, String paramAddress){
        this.name = paramName;
        this.address = paramAddress;
    }

    Person1(String paramName){
        this(paramName, null);
    }

    Person1(){
        this(null);
    };

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + this.name);
    }
}
