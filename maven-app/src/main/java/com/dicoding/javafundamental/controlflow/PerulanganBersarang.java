package com.dicoding.javafundamental.controlflow;

public class PerulanganBersarang {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for( int i =5; i>=1; i--){
            String str = "";
            for( int j = 0 ; j<i; j++){
                str+="*";
            }
            System.out.println(str);
        }

        int value = 1;
        while (value <= 10) {
            System.out.print("Angka : " + value);
            value++;
            System.out.print("\n");
        }

        int value1 = 1;
        do {
            System.out.println("Angka : " + value1);
            value1++;
        } while (value1 <= 10);
    }
}
