package com.dicoding.javafundamental.collection;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//tidak boleh duplikat
public class SetPlanet {
    public static void main(String[] args) {

          //Menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set

        System.out.println(planets);

        //method size() untuk mendapatkan ukuran
        System.out.println("Set planets awal : " + "Size : " + planets.size());

        for(String planet : planets){
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
