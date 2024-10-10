package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.MyData;

public class InvariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Heru");

        // doIt(stringMyData); //Error
        //MyData<Object> objectMyData = stringMyData; //Error

        MyData<Object> objectMyData = new MyData<>(1000);
        //MyData<Integer> integerMyData = objectMyData; //Error
        //doItInteger(objectMyData);// Error
    }

    public static void doIt(MyData<Object> objectMyData){
        //
    };

    public static void doItInteger(MyData<Integer> integerMyData){
        //
    };
}
