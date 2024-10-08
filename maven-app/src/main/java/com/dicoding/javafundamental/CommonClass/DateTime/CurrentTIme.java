package com.dicoding.javafundamental.CommonClass.DateTime;

public class CurrentTIme {
    //Method yang mengembalikan waktu sekarang dalam millisecond
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalah " + timeNow + "milisecond");
    }
}
