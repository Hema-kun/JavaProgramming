package com.dicoding.javafundamental.basic.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][] fixedSizeArray = new char[2][3];
        fixedSizeArray[0][0] = 'A';
        fixedSizeArray[0][1] = 'B';
        fixedSizeArray[0][2] = 'C';
        fixedSizeArray[1][0] = 'D';
        fixedSizeArray[1][1] = 'E';
        fixedSizeArray[1][2] = 'F';

        // Deklarasi dan inisialisasi langsung dengan nilai
        char[][] initializedArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'}
        };

        // Deklarasi dan inisialisasi jagged
        char[][] jaggedArray = new char[2][];
        jaggedArray[0] = new char[3];
        jaggedArray[1] = new char[2];
        jaggedArray[0][0] = 'A';
        jaggedArray[0][1] = 'B';
        jaggedArray[0][2] = 'C';
        jaggedArray[1][0] = 'D';
        jaggedArray[1][1] = 'E';

        // Menampilkan fixedSizeArray
        System.out.println("Fixed Size Array:");
        for (int i = 0; i < fixedSizeArray.length; i++) {
            for (int j = 0; j < fixedSizeArray[i].length; j++) {
                System.out.print(fixedSizeArray[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan initializedArray
        System.out.println("Initialized Array:");
        for (int i = 0; i < initializedArray.length; i++) {
            for (int j = 0; j < initializedArray[i].length; j++) {
                System.out.print(initializedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan jaggedArray
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        //dicoding
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];

        // Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';
        // Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';
        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);


    }
}
