package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.City;
import com.dicoding.javafundamental.PZN.JavaOOP.Data.Location;

public class LocationAPp {

    public static void main(String[] args) {

        // var location = new Location();
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
