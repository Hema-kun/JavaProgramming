package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.LoginRequest;
import com.dicoding.javafundamental.PZN.JavaOOP.Error.ValidationException;
import com.dicoding.javafundamental.PZN.JavaOOP.Util.ValidationUtil;

public class ValidationApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Heru", "");

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException  | NullPointerException e){
            System.out.println("Data tidak valid : " +  e.getMessage()) ;
        }finally {
            System.out.println("Error ga error akan dijalankan");
        }
    }
}
