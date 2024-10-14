package com.dicoding.javafundamental.PZN.JavaCollection;

import com.dicoding.javafundamental.PZN.JavaCollection.Data.Person;

import java.util.List;

public class MutableApp {

    public static void main(String[] args) {

        Person person = new Person("Heru");

        person.addHoby("Game");
        person.addHoby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        //hobbies.add("Bukan hobby");
    }


}
