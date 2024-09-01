package com.dicoding.javafundamental.Dasar1PZN;

public class SwitchStatement {
    public static void main(String[] args) {

        char nilai = 'k';

        switch (nilai){
            case 'A':
                System.out.println("Oke");
                break;
            case 'B':
                System.out.println("Oke");
                break;
            case 'C':
                System.out.println("Oke");
                break;
            case 'D':
                System.out.println("Oke");
                break;
            default:
                System.out.println("Sans");
        }

        //Switch Lambda java-14
        switch (nilai){
            case 'A' -> System.out.println("Lulus");
            case 'B' -> System.out.println("Cukup");
            case 'C' -> System.out.println("Pass");
            case 'D' -> System.out.println("Gagal");
            default -> {
                System.out.println("Mungkin salah");
            }
        }

        //switch yield java-14
        String ucapan = switch (nilai){
            case 'A' : yield ("Lulus");
            case 'B' : yield ("Cukup");
            case 'C' : yield ("Pass");
            case 'D' : yield ("Gagal");
            default : {
                yield ("Mungkin salah");
            }
        };
        System.out.println(ucapan);
    }
}
