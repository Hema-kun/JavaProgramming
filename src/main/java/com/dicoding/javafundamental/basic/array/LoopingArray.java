package com.dicoding.javafundamental.basic.array;

public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[100];

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for(int i = 0 ; i<arrInt.length ; i++){
            if(i % 2 != 0){
                arrInt[i] = i;
                System.out.println(arrInt[i]);
            }
        }
    }
}
