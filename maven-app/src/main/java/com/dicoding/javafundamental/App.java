package com.dicoding.javafundamental;

import com.google.gson.Gson;
import pzn.maven.Person;

public class App {

    public static void main(String[] args) {

        Gson gson = new Gson();

        Person person = new Person("Heru");
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
