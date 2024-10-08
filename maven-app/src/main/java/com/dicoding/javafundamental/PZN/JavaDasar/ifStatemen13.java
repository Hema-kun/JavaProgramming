package com.dicoding.javafundamental.PZN.JavaDasar;

public class ifStatemen13 {

    public static void main(String[] args) {

        var nilai = 70;
        var absen = 90;

        var lulusNilai = nilai>=75;
        var lulusAbsen = absen>=75;

        var lulus = lulusNilai&lulusAbsen;

        if(nilai >= 75 && absen >=75){
            System.out.println("Anda lulus");
        }

        if(lulus){
            System.out.println("Anda lulus");
        }else{
            System.out.println("Coba lagi");
        }

        if(nilai >= 80 && absen >= 80){
            System.out.println("Nilai A");
        }else if(nilai >= 70 && absen >=70){
            System.out.println("Nilai B");
        }else {
            System.out.println("Nilai C");
        }

    }
}
