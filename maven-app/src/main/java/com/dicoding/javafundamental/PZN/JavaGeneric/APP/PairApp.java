package com.dicoding.javafundamental.PZN.JavaGeneric.APP;

import com.dicoding.javafundamental.PZN.JavaGeneric.Pair;

public class PairApp {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("Heru", 24);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
