package com.dicoding.javafundamental.PZN.JavaDasar;

public class Array8 {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[2];

        stringArray[0] = "Heru";
        stringArray[1] = "Purnama";
        System.out.println(stringArray[0]+" "+stringArray[1]);

        stringArray[0] = "Heruu";
        System.out.println(stringArray[0]+" "+stringArray[1]);

        String[] stringArray2 = new String[2];

        String[] nama = {"Heru", "Purnama"};
        nama[0] = null;
        System.out.println(nama[0]);
        System.out.println(nama.length);

        //array dalam array (2dimensi)

        String[][] members = {
                {"Heru", "Purnama"},
                {"Eko","Kurniawan"},
                {"Budi"}
        };

        System.out.println(members[2][0]);
        System.out.println(members[1][0]);

    }
}
