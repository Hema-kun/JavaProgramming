package com.dicoding.javafundamental.PZN.JavaOOP.Inheritance;

public class VicePresident extends Manager{

    //   kemampuan deklar ulang method di child class, yg sudah ada di parent class

    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is VP" + this.name );
    }
}
