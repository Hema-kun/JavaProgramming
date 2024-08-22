package com.dicoding.javafundamental.basic.array;

public class array {
    public static void main(String[] args) {

        //Approach-1
        //Definisikan + inisiasi
        //int[] arrInt = new int[]{1,2,3,4,5,6};
        int[] arrInt = {1,2,3,4,5,6};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);

        //Approach-2
        //Definisikan then insiasi
        int[] arInt = new int[6];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        arrInt[3] = 4;
        arrInt[4] = 5;
        arrInt[5] = 6;

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
    }
}
