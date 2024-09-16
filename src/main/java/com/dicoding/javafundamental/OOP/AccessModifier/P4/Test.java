package com.dicoding.javafundamental.OOP.AccessModifier.P4;

import java.io.Serializable;
//Transient memiliki hubungan dengan proses serialisasi (serializing). Serialisasi adalah proses konversi suatu objek menjadi byte agar dapat ditransmisikan.
class Test implements Serializable {

    //Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;

    //variabel inni akan dijaga nilainya
    double nilaiB;
    String nilaiC;


    //Synchronized modifier digunakan untuk membatasi akses ke suatu variable/methods yang hanya boleh dilakukan oleh satu thread. Ketika ada 2 thread yang ingin mengakses synchronized variable/methods, maka prosesnya akan dilakukan secara serial (bergantian).
    public synchronized void showData() {

    }

}
