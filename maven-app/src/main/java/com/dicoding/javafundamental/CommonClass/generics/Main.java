package com.dicoding.javafundamental.CommonClass.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List lo = new ArrayList<>(); //List tanpa type-paramater
        lo.add("lo - String 1"); //lo menampung objek string
        lo.add(new Planet("mercury", 0.06)); //lo menampung objek planet

        for (Object o : lo){
            Planet p = (Planet) o; //perlu type-casting dari object ke planet
            p.print();
        }


        List<Planet> lp = new ArrayList<>(); //dengan type-parameter
        lp.add(new Planet("Mercury", 0.06)); //lp menampung objek planet
        //lp.add("lp - String 1"); //baris ini error -> lp tidak diijinkan menampung objek string
        lp.add(new Planet("Venus", 0.82));

        for (Planet p : lp){
            p.print();
        }

    }
}
