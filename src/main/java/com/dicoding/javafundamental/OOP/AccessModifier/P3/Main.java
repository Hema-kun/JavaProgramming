package com.dicoding.javafundamental.OOP.AccessModifier.P3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nilai nyaa adalah " + Perhitungan.nilai);

        for(int x=0;x<5;x++){
            new Perhitungan();
        }

        System.out.println("Sampai" + Perhitungan.nilai);

        System.out.println("Getnilai = " + Perhitungan.getNilai());
    }
}
