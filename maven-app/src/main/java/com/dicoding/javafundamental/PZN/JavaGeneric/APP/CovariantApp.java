package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.MyData;

public class CovariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Heru");


        process(stringMyData);

        MyData<? extends Object> myData =stringMyData;
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        // Error myData.setData(1);
    };
}
