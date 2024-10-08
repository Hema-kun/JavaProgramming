package com.dicoding.javafundamental.PZN.JavaOOP.Application;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.Customer;
import com.dicoding.javafundamental.PZN.JavaOOP.Data.Level;

public class EnumApp {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Heru");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

       for(var value : Level.values()){
           System.out.println(value);
       }
    }
}
