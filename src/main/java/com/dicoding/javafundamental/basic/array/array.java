package com.dicoding.javafundamental.basic.array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {


        //deklarasi
        double[] arrA;
        arrA = new double[10];

        //inisisiasi
        //Approach-1
        int[] arrInt = new int[]{1,2,3,4,5,6};
        //int[] arrInt = {1, 2, 3, 4, 5, 6};
        System.out.println("Panjang elemen = " + arrInt.length);

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        System.out.println(Arrays.toString(arrInt));
        for(int a : arrInt){
            System.out.print(a + " ");
        }
        for(int a1=0; a1<arrInt.length; a1++){
            System.out.print(arrInt[a1] + " ");
        }

        //Approach-2
        int[] arrInt2 = new int[6];
        arrInt2[0] = 1;
        arrInt2[1] = 2;
        arrInt2[2] = 3;
        arrInt2[3] = 4;
        arrInt2[4] = 5;
        arrInt2[5] = 6;

        System.out.println("Panjang elemen = " + arrInt2.length);

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);
    }
}
