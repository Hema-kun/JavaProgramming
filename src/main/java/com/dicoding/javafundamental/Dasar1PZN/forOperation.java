package com.dicoding.javafundamental.Dasar1PZN;

public class forOperation {
    public static void main(String[] args) {

        //no end
//        for(;;){
//            System.out.println("Good");
//        }

        //for with kondisi
        int counter = 1;

        for(; counter<=10;){
            System.out.println("Ulang");
            counter++;
        }

        //for with init
        for(int counter2 = 1 ; counter2<=10; counter2++){
            System.out.println("Perulangan");
        }

        //break
        for(int counter2 = 1 ; counter2<=10; counter2++){
            System.out.println("Perulangan");

            if(counter2 > 5){
                break;
            }
        }

        //continue
        for(int counter3 = 1 ; counter3<=100; counter3++){
            if(counter3 % 2 == 0){
                continue;
            }

            System.out.println(counter3);
        }

        //forEach ->Array
        String[] array = {
                "Eko", "Kurniawan", "khennedy"
        };
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
        for(var value : array){
            System.out.println(value);
        }
    }
}
