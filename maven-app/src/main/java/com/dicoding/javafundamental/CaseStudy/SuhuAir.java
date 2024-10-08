package com.dicoding.javafundamental.CaseStudy;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        //Contoh pemakaian if tiga kasus

        //Kamus

        int T;

        //Program
        System.out.println("Contoh IF Tiga Kasus");
        System.out.print("Suhu (der. C) = ");

        //Scanner utk masukan suhu air
        Scanner input = new Scanner(System.in);
        T = input.nextInt(); //Masukkan suhu air dengan tipe int

        //Proses pengecekan dengan IF
        if ( T < 0){
            System.out.println("Wujud air beku " + T);
        }else if ( (T >= 0) && (T <= 100)){
            System.out.println("Wujud air cair " + T);
        }else if ( T >= 100){
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
