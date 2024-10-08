package com.dicoding.javafundamental.OOP.Interface;

public interface Hewan {
    //Konsep: Interface mendefinisikan metode-metode yang tidak memiliki implementasi. Kelas yang mengimplementasikan interface harus memberikan implementasi untuk metode-metode tersebut.
    //
    //Tujuan: Memastikan bahwa kelas-kelas yang mengimplementasikan interface mengikuti kontrak yang sama, tanpa peduli bagaimana mereka melakukannya.

    //interface sangat mirip dengan kelas,
    // tapi tanpa atribut kelas dan memiliki metode
    // yang dideklarasikan tanpa isi.
    // Deklarasi metode pada sebuah interface dapat diimplementasikan oleh kelas lain.
    //Prorty bersifat static final, method bersifat public

    String RESPIRASI = "Oksigen";

    void makan();
}
