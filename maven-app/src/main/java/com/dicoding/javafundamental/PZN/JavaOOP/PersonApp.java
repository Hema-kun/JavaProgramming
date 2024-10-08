package com.dicoding.javafundamental.PZN.JavaOOP;

import org.w3c.dom.ls.LSOutput;

public class PersonApp {

    public static void main(String[] args) {

        var person = new Person1("Heru","Bogor");
        //person.name = "Heru ";
        //person.address = "Bogor ";
       // person.country = "Amrik";


        System.out.println(person.name + person.address + person.country);
        person.sayHello("Purnama");


        Person1 person2 = new Person1();
        Person1 person3 = new Person1("Joko");
        System.out.println(person2);

        person2.name = "Budi";
        person3.name = "Joko";

        person3.sayHello("Budi");
    }

}
