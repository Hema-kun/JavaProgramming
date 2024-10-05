package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Heru", "Purnama");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Heru"));
        System.out.println(new LoginRequest("Heru","rahasia"));
    }
}
