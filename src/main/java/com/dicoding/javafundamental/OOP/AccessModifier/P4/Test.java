package com.dicoding.javafundamental.OOP.AccessModifier.P4;

import java.io.Serializable;

public class Test implements Serializable {

    //Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;

    //variabel inni akan dijaga nilainya
    double nilaiB;
    String nilaiC;
}
