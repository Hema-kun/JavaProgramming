package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Error.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {

        connectDatabase("Heru", null);
    }

    public static void connectDatabase(String username, String password){

        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
