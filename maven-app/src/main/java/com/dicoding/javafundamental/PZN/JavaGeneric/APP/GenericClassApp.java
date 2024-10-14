package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.MyData;

public class GenericClassApp {

    public static void main(String[] args) {

        //Dari class MyData -> generate value
        MyData<String> stringMyData = new MyData<>("Heru");
        MyData<Integer> integerMyData= new MyData<>(24);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
