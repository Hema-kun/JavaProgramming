package com.dicoding.javafundamental.CaseStudy.BangunDatar;

public class Lingkaran implements bangundatar{

    private double pi = 3.14;

    Lingkaran(){

    }

    @Override
    public double luas(int s1, int s2){
        return 0;
    }

    @Override
    public double keliling(int s1, int s2){
        return 0;
    }

    public double luas(int r) { //metode overload
        return (pi * r * r);
    }
    public double keliling(int r) { //methode overload
        return (2 * pi * r);
    }
}
