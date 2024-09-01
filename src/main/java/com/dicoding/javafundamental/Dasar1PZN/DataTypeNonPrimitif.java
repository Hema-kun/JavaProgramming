package com.dicoding.javafundamental.Dasar1PZN;

public class DataTypeNonPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;

        Byte iniByte = null;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        short shortAge = iniInteger2.shortValue();
        System.out.println(shortAge);
    }
}
