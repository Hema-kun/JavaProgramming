package com.dicoding.javafundamental.Dasar1PZN;

public class method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Heru","purnama");
        System.out.println(sum(2,2));
        System.out.println(hitung(1,"+",5));
    }

    static void sayHelloWorld(){
        System.out.println("Hello World");
    }

    static void sayHello(String Name, String lastNamme){
        System.out.println(Name + lastNamme);
    }

    static int sum(int value1, int value2){
        var total = value2 + value1;
        return total;
    }

    static int hitung(int value3, String operasi, int value4){
        switch (operasi){
            case "+":
                return value3 + value4;
            case "-":
                return  value3-value4;
            default:
                return 0;

        }
    }
}
