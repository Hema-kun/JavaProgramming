package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.HelloWorld;

public class HelloWorldApp {

    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {

                System.out.println("Hello" + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {

            }

            @Override
            public void sayHello(String name) {

            }
        };

        english.sayHello();
        english.sayHello("Heru");

        indonesia.sayHello();
        indonesia.sayHello("Heru");
    }
}
