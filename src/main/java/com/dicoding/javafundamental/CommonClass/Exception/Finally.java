package com.dicoding.javafundamental.CommonClass.Exception;

public class Finally {
    public static void main(String[] args) {
        int[] a = new int[5];
        try{
            System.out.println("Akses elemen ke 5" + a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throw :" + e);
        }finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
    }
}
