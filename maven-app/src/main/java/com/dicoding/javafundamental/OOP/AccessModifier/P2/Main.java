package com.dicoding.javafundamental.OOP.AccessModifier.P2;

import com.dicoding.javafundamental.OOP.AccessModifier.P1.KelasA;

public class Main {
    public static void main(String[] args) {

        // Kode ini pasti akan mengalami kompiler error
        //Protected memiliki akses dari luar package selama kelas tersebut merupakan turunannya.
        KelasA kelasA = new KelasA();
        //System.out.println(kelasA.functionB());
        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);


        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
