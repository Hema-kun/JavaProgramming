package com.dicoding.javafundamental.CaseStudy;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        //Contoh pemakaian if tiga kasus


        //Program
        System.out.println("Contoh IF Tiga Kasus");
        System.out.print("Suhu (der. C) = ");

        //Scanner utk masukan suhu air
        Scanner input = new Scanner(System.in);
        int Celsius = input.nextInt(); //Masukkan suhu air dengan tipe int

        //Proses pengecekan dengan IF
        if ( Celsius  < 0){
            System.out.println("Wujud air beku " + Celsius);
        }else if ( (Celsius >= 0) && (Celsius <= 100)){
            System.out.println("Wujud air cair " + Celsius);
        }else if ( Celsius >= 100){
            System.out.println("Wujud air uap/gas " + Celsius);
        }
    }
}
