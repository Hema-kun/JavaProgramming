package com.dicoding.javafundamental.PZN.JavaDasar;

public class Method19 {

    public static void main(String[] args) {
        sayHelloWorld();
        System.out.println(age(10));
        sayHello("Heru","Purnama");

        System.out.println(sum(10,14));

        System.out.println(hitung(10,"+",15));

        int[] values ={ 90,90,90,90};
        sayCongrats("Heru", values);

        sayCongrats("Heru", 80,70,60);

        System.out.println(factorial(3));
        System.out.println(factorial(5));
    }

    static void sayHelloWorld(){
        System.out.println("Hello");
    }

    static void sayHello(String name, String lastName){
        System.out.println(name + lastName);
    }

    static int age(int umur){
        return umur;
    }

    static int sum(int value1, int value2){
        var total = value1+value2;
        return total;
    }

    static int hitung(int value1, String Operasi, int value2){
        switch (Operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;

        }
    }

    //method variabel argument
    //utk mengirim data ke method dlm sejumlah data yg tidak pasti
    //2 method dibawah termasuk overloading
    //kemampuan membuat method dengan nama yg sama tapi berbeda parameter

    //tanpa variabel argument
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Anda lulus");
        }else{
            System.out.println("tidak lulus");
        }
    }

    //dengan variabel argument
    static void sayCongrats(String name, long... values){
        var total = 0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Anda lulus");
        }else{
            System.out.println("tidak lulus");
        }
    }

    static int factorial(int value){
        var result = 1;
        for(int i=1; i<=value; i++){
            result*=i;
        }
        return result;
    }

    static long factorial(long value){
        if(value == 1){
            return 1;
        }else{
            return value * factorial(value-1);
        }
    }
}
