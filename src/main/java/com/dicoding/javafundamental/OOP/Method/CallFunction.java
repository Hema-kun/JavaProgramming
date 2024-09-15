package com.dicoding.javafundamental.OOP.Method;

//modifier menunjukkan sifat yang dimiliki pada suatu fungsi seperti public, private, protected.
//returnType merupakan nilai balik yang diberikan oleh fungsi. Apabila fungsi tidak memiliki nilai balik maka menggunakan void.
//nameOfFunction adalah nama dari sebuah fungsi.
//parameters bersifat opsional, Suatu fungsi dapat mempunyai banyak parameters atau pun tidak sama sekali.
//Sedangkan untuk fungsi yang tidak mengembalikan nilai (void) disebut sebagai prosedur.

public class CallFunction {

    public static void main(String[] args) {
        //Memanggil fungi
        cobaFungsi();
    }

    public static void cobaFungsi(){
        System.out.println("Ini merupakan fungsi");
    }
 }
