package com.dicoding.javafundamental.PZN.JavaOOP.Data;

public record LoginRequest(String username, String password) {


    public LoginRequest{
        System.out.println("Buat object loginrequest");
    }

    public LoginRequest(String username){
        this(username, "");

    }

    public LoginRequest()
    {
        this("","");
    }

    public void sayHello(){

    }

}
