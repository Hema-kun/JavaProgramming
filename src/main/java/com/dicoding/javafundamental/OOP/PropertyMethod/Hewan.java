package com.dicoding.javafundamental.OOP.PropertyMethod;

public class Hewan {

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
