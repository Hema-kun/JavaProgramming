package com.dicoding.javafundamental.CommonClass.IO;

import java.io.File;

public class FileNavigation {
    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;

        try{
            //Instansiasi objek file
            file = new File(dirname);

            //Ambil list files dan massukan ke string Paths
            paths = file.list();

            //tampilkan semua path
            for(String path : paths){
                System.out.println(path);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
