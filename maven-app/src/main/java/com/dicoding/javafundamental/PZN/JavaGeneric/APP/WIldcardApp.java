package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.MyData;

public class WIldcardApp {

    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Heru"));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
