package com.dicoding.javafundamental.CommonClass.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList<>(); //List tanpa type parameter
        lo.add("lo - String 1"); //lo menampung objek String
        lo.add(new Planet("mercury",0.06));

        for(Object o : lo){
            Planet p = (Planet) o; //perlu type-casting dari Object ke Planet
            p.print();
        }

        List<Planet> lp = new ArrayList<>(); //List menampung type-paramater Planet
        lp.add(new Planet("mercury",0.06)); //lp menampung objek planet
//        lp.add("lp - String 1"); //baris ini compile-error, lp tidak dijinkan menampung objek String

        lp.add(new Planet("Venus", 0.82));

        for(Planet p : lp){
            p.print();
        }
    }
}
