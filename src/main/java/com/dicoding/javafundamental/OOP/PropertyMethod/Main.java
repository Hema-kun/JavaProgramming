package com.dicoding.javafundamental.OOP.PropertyMethod;

public class Main {

    public static void main(String[] args) {
        //Kita tambahkan 1 argumen dengan nilai int 2
        //Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Hewan Kucing = new Hewan(2);
        Kucing.lari();
        Kucing.jalan();
        Kucing.makan();

        // Contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah " + Kucing.getUmur());
        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = Kucing.getBerat() / ((Kucing.getTinggi() * 0.01) * (Kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
}
