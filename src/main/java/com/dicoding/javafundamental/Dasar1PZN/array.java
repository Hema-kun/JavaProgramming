package com.dicoding.javafundamental.Dasar1PZN;

public class array {
    public static void main(String[] args) {
        //String[] stringArray = new String[3];
        String[] stringArray;
        stringArray = new String[2];

        stringArray[0] = "Heru";
        stringArray[1] = "Purnama";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        stringArray[0] = "Hema";
        System.out.println(stringArray[0]);


        //Approach-2
        int[] arrayInt = new int[]{10,90,10};
        System.out.println(arrayInt[0]);

        //Operasi
        System.out.println(arrayInt.length);

        //Array 2 dimensi/array dalam array
        String[][] members = {
                {"Heru", "Purnama"},
                {"Hema", "Kun"},
                {"Hepu", "Desu"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);



    }
}
