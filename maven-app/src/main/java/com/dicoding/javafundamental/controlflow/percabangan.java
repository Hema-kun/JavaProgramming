package com.dicoding.javafundamental.controlflow;

public class percabangan {
    public static void main(String[] args) {

        boolean isOn = true;

        if(isOn){
            System.out.println("Nyalakan lampu");
        }else{
            System.out.println("Tidak nyala");
        }

        int nilaiUjian = 80;
        char indekPrestasi;

        if(nilaiUjian>=90){
            indekPrestasi = 'A';
        }else if(nilaiUjian>=80){
            indekPrestasi = 'B';
        }else{
            indekPrestasi = 'C';
        }

        System.out.println(indekPrestasi);

    }
}
