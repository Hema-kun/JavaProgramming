package com.dicoding.javafundamental.PZN.JavaOOP.Inheritance;

public class ManagerApp {

    public static void main(String[] args) {

        var manager = new Manager("heru");
        manager.sayHello("Budi");

        var vp = new VicePresident("Joko");
        vp.sayHello("Budi");
    }


}
