package com.dicoding.javafundamental.OOP.PropertyMethod;

public class Hewan {
//Properti atau fields adalah atribut yang menjadi anggota dari suatu kelas.
    //properti
    //inisialiasi dengan nilai
    double tinggi = 30;
    double berat = 3;

    //inisialiasi melalui konstruktor
    int umur;

    //konstruktor dengan parameter
    Hewan(int umur){
        this.umur = umur;
    }

    //Metode di dalam kelas adalah block statement yang memiliki nama dan bisa dieksekusi dengan memanggilnya.
    void lari(){
        System.out.println("Berlari");
    }

    void jalan(){
        System.out.println("Berjalan");
    }

    void makan(){
        System.out.println("Makan");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }

}
