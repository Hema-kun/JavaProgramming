package com.dicoding.javafundamental.PZN.JavaDasar;

public class SwitchStatement14 {

    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Lulus");
                break;
            case "B":
                System.out.println("Cukup");
                break;
            case "C":
                System.out.println("Tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        //Switch Lambda ->14 up
        switch (nilai){
            case "A" -> System.out.println("Anda lulus");
            case "B", "C" -> System.out.println("Cukup");
            case "D" -> System.out.println("Tidak lulus");
            default -> {
                System.out.println("Mungkin salah jurusan");
            }
        }

        //tanpa yield
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Lulus";
            case "B", "C" -> ucapan = "Cukup";
            case "D" -> ucapan = "Tidak lulus";
            default -> {
                ucapan = "Anda salah jurusan";
            }
        }

        System.out.println(ucapan);

        //dengan yield
        //utk mengembalikan nilai pada switch statement
        ucapan = switch (nilai){
            case "A": yield "Lulus";
            case "B", "C": yield "Cukup";
            case "D": yield "Tidak lulus";
            default: yield "Anda salah jurusan";

        };
    }
}
