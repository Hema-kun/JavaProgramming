package com.dicoding.javafundamental.basic.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBuffered {

    public static void main(String[] args) {

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        System.out.println("Program penjumlahan ");
        int value = 0;
        int value2 = 0;
        try{
            System.out.print("Masukkan angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        int result = value + value2;
        System.out.println("Hasil : " + result);
    }
}
