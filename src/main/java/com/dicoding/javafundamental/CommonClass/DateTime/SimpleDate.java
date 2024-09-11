package com.dicoding.javafundamental.CommonClass.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    //Kelas yang membantu menterjemahkan format waktu dalam bentuk String ke format date time serta sebaliknya

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanngal dengan format " + dateFormated);
    }
}
