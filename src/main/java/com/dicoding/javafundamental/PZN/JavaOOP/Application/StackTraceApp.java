package com.dicoding.javafundamental.PZN.JavaOOP.Application;

public class StackTraceApp {

    public static void main(String[] args) {

        try {
           sampleError();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] names = {
                    "EKo", "Kurniawan"
            };

            System.out.println(names[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
