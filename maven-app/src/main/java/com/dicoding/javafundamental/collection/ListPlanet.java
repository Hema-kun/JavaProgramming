package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

//List adalah suatu Collection di mana data yang masuk akan disimpan secara teratur. List mempunyai index berdasarkan urutan objek yang dimasukkan ke dalam List.
// Boleh duplikat
public class ListPlanet {

    public static void main(String[] args) {

        //deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "Riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        //Menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury"); //method add utk menambahkan objek ke list
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");  //objek lainnya utk masukke list

        System.out.println("List planets awal : ");
        for(int i=0; i<planets.size(); i++){
            //method get utk melihat isi list pada index i
            System.out.println("\t index-"+ i + " = " + planets.get(i));
        }

        planets.remove("Venus"); //method remove() utk mengeluarkan objek dari list

        System.out.println("List planets akhir : ");
        for(int i =0; i<planets.size(); i++){
            System.out.println(" index-"+ i + " = " + planets.get(i));
        }
        System.out.println(planets);
    }
}
