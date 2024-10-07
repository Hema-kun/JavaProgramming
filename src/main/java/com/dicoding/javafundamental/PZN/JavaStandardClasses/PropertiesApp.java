package com.dicoding.javafundamental.PZN.JavaStandardClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {

    public static void main(String[] args) {


        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));


            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host + port + username + password);

        }catch (FileNotFoundException e){
            System.out.println("File tidak ketemu");
        }catch (IOException e){
            System.out.println("Gagal load");
        }

        try{


            Properties properties2 = new Properties();
            properties2.put("name.first", "Heru");


            properties2.store(new FileOutputStream("name.properties"), "konfigurasi.name");
        }catch (FileNotFoundException e){
            System.out.println("Gagal buat properites");
        }catch (IOException e){
            System.out.println("Error menyimpan properties");
        }
    }
}
