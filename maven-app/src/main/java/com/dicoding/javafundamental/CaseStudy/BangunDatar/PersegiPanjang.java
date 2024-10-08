package com.dicoding.javafundamental.CaseStudy.BangunDatar;

public class PersegiPanjang implements bangundatar{

    PersegiPanjang(){
    }

    @Override
    public double luas(int s1, int s2){
        return (s1 * s2);
    }

    @Override
    public double keliling(int s1, int s2){
        return (2 * (s1 + s2));
    }
}
