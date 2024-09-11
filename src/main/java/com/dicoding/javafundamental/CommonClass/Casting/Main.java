package com.dicoding.javafundamental.CommonClass.Casting;

public class Main {
    //Mengubah suatu tipe data atau objek menjadi tipe data atau objek lainnya, akan menjadi mudah dengan menggunakan casting yang sudah tersedia di dalam Java.

    public static void main(String[] args) {
        int a = (int) 3.14;

        System.out.println(a);

        double b = 3.14;
        String hasil = String.valueOf(b);
        System.out.println(hasil);

        Kucing anggora = new Kucing();

        Hewan hewan = anggora; //upcasting implisit
        hewan = (Hewan) anggora; //upcasting explisit, casting dari subclass ke superclass

        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).meow(); //downcasting hewan ke kucing, casting dari superclass ke subclass

    }
}
