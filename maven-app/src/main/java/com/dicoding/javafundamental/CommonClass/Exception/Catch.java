package com.dicoding.javafundamental.CommonClass.Exception;

import java.io.File;
import java.io.FileReader;

public class Catch {
    public static void main(String[] args) {

        try{
            //Memboca membaca berkas latihan.txt
            String location = "D.//namafile.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file);
            // Jika berhasil, maka tampilkan pesan
        } catch (Exception e){
            //Jika terjadi kesalahan, maka tampikan pesan
            System.out.println(e.getMessage());
        }

    }
}
