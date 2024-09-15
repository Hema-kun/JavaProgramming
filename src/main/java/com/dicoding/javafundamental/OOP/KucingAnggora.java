package com.dicoding.javafundamental.OOP;

//Constructor adalah method yang secara default sudah terbentuk ketika kelas dibuat
//memberikan nilai awal pada data/objek
//mengalokasikan ruang pada class

public class KucingAnggora {

    //non-argument constructor (tanpa body)
    public KucingAnggora(){

    }

    private String namaKucing;
    private  int beratBadan;
    //Parameter constructor (with paramater & body)
    //dengan memberikan nilai awal data member nama_kucing dan berat_badan
    //dengan parameter yang kita tentukan
    public void KucingAnggora1(String name, int berat){
        namaKucing = name;
        beratBadan = berat;
    }
}
