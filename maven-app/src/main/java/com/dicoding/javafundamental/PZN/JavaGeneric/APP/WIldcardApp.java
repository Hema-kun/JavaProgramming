package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.MyData;

public class WIldcardApp {

    public static void main(String[] args) {
        printLength(new MyData<Integer>(100));
        printLength(new MyData<String>("Heru"));
    }

    public static void printLength(MyData<?> Data){
        System.out.println(Data.getData());
    }
}
