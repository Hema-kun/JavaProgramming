package com.dicoding.javafundamental.basic.inputouput;

import java.util.Scanner;

public class InputOutputOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program sederhanaa");
        System.out.print("Masukkan angka pertama : ");
        int value = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int value2 = input.nextInt();
        int result = value + value2;
        System.out.println("Hasilnya: " + result);

    }
}
