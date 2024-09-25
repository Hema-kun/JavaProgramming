package com.dicoding.javafundamental.PZN.JavaDasar;

public class Scope20 {

    public static void main(String[] args) {


    }

    static void sayHello(String name){

        String hello = "hello" + name;
        if(!name.isBlank()){
            String hi = "hi" +name;
            System.out.println(hi);
        }
        System.out.println(hello);
        System.out.println(hi);//error
    }
}
