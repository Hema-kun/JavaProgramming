package com.dicoding.javafundamental.PZN.JavaDasar;

public class ForEach18 {

    public static void main(String[] args) {

        String[] name = {
                "Heru", "Purnama"
        };

        for( var i=0; i<name.length;i++){
            System.out.println(name[i]);
        }

        //for Each
        for(var nama : name){
            System.out.println(nama);
        }
    }
}
