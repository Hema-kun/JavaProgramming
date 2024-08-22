package com.dicoding.javafundamental.basic.controlflow;

public class percabangan {
    public static void main(String[] args) {
        boolean isOn = false;

        if (isOn) {
            System.out.println("Menyalan Lampu");
        } else {
            System.out.println("Kondisi tidak terpenuhi");
        }

        int nilaiUjian = 80;
        char indeksPrestasi;
        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }
        System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
    }
}
