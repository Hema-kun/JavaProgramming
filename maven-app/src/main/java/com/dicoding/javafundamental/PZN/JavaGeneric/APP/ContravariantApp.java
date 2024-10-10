package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.MyData;

public class ContravariantApp {

    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Heru");
        MyData<? super String> myData = objectMyData;


        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){

        String value = (String) myData.getData();
        System.out.println("Paramater : " + value);

        myData.setData("Heru Purnama");
    }
}
