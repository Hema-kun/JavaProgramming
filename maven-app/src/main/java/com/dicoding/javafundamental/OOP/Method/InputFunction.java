package com.dicoding.javafundamental.OOP.Method;

public class InputFunction {
    public static void main(String[] args) {
        hitungLuas(7,6.5);
    }

    public static void hitungLuas(double panjang, double lebar){
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
