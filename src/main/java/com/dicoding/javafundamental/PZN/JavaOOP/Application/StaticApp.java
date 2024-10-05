package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.Application;
import static com.dicoding.javafundamental.PZN.JavaOOP.Data.Constant.*;
import com.dicoding.javafundamental.PZN.JavaOOP.Data.Country;
import com.dicoding.javafundamental.PZN.JavaOOP.Util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {

        //cara static import 2 dibawah + diatas bintang yg constant, selain itu cara normal
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Bogor");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}
