package com.dicoding.javafundamental.basic.inputouput;

import java.util.Scanner;

public class InputOutputOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program penjumlahan sederhana");
        System.out.print("Masukkan Angka pertama");
        int value = input.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = input.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
