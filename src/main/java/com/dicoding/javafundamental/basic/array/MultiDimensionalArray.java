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

    }
}
