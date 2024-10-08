package com.dicoding.javafundamental.OOP.objek;


//Menciptakan Objek
//Karena objek merupakan instansiasi dari kelas, untuk menciptakan suatu objek kita perlu mendeklarasikan tiap objek yang dibuat dengan mengikutsertakan kelasnya. Pada Java untuk membuat sebuah objek terdapat 3 tahap :
//
//Declaration : mendeklarasikan nama sebuah objek.
//Instantiation : memerlukan sebuah perintah new untuk menciptakan objek.
//Initialization : inisialisasi dari sebuah objek setelah perintah new.
public class Main {
    public static void main(String[] args){

        //Menciptakan object dengan nama "objekHewan"
//        Hewan objectHewan = new Hewan();
//        objectHewan.cetakNama("Elang");

        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
