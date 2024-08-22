package com.dicoding.javafundamental.basic.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        //dimensi 1 indeks 0 panjang 2 element
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';

        //dimensi 1 indeks 1 panjang 3 element
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';
        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);

//        System.out.println(arrChar[0][2]);
        System.out.println(arrChar.length);

        for(int i=0;i<arrChar.length;i++){
            if(arrChar[i][i] == 'D' ){
                System.out.println("E");
            }
        }
        for (int i = 0; i < arrChar.length; i++) {
            for (int j = 0; j < arrChar[i].length; j++) {
                System.out.print(arrChar[i][j] + " ");
            }
            System.out.println();
        }

    }
}
