package com.dicoding.javafundamental;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.Gitar;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Gitar.bunyi();

        Mobil.tampilkanJumlahBan();
        Motor.tampilkanJumlahBan();
        Kereta.tampilkanJumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = = " + today);
//        Date tomorrow = DateUtils.addDays(today,1);
//
//        System.out.println("Besok = " + tomorrow);

    }
}
