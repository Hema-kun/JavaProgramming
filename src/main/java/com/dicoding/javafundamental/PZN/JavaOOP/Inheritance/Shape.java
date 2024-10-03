package com.dicoding.javafundamental.PZN.JavaOOP.Inheritance;

public class Shape {

    //Super utk akses attribute/method diparent class
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{

    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}
