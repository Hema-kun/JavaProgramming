package com.dicoding.javafundamental.CommonClass.IO;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Stream adalah proses secara sekuensial elemen data dari waktu ke waktu

        //byte Streams 8 bit
        FileInputStream in = null;
        FileOutputStream out = null;

        //character streams 16 bit
        // FileReader in = null;
        // FileWriter out = null;

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(in != null){
                    in.close();
                }
                if(out != null){
                    out.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
