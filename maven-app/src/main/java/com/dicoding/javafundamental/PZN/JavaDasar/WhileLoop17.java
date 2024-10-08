package com.dicoding.javafundamental.PZN.JavaDasar;

public class WhileLoop17 {

    public static void main(String[] args) {

        var counter = 1;

        while (counter <= 10){
            System.out.println("Perulangan " + counter);

            if(counter == 5){
                System.out.println("Ini break;");
                break;
            }
            counter++;
        }

        //do While Loop

        var counter2 = 100;

        do{
            System.out.println("Perulangan ke " + counter2);
            counter2--;
        }while(counter2>90);

        for(var counter3 = 1; counter3<=10;counter3++){
            if (counter3 % 2 != 0){
                continue;
            }

            System.out.println("Perulangan-Genap " + counter3);
        }

    }
}
