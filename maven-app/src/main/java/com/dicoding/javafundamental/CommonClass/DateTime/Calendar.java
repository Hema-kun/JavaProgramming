package com.dicoding.javafundamental.CommonClass.DateTime;

public class Calendar {
    //Kelas yang memiliki spesifik method untuk mengkonversi waktu dan tanggal

    public static void main(String[] args) {
        //Menampilkan waktu sekarang

        java.util.Calendar calendar = java.util.Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        //Menampilan spesifik
        System.out.println("Tanggal : " + calendar.get(java.util.Calendar.DATE));
        System.out.println("Bulan : "+ calendar.get(java.util.Calendar.MONTH));
        System.out.println(("Tahun : "+ calendar.get(java.util.Calendar.YEAR)));

        // Menampilkan waktu 15 hari yang lalu
        calendar.add(java.util.Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: " + calendar.getTime());
        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(java.util.Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: " + calendar.getTime());
        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(java.util.Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian: " + calendar.getTime());
    }
}
