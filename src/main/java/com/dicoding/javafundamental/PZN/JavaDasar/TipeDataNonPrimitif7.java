package com.dicoding.javafundamental.PZN.JavaDasar;

public class TipeDataNonPrimitif7 {

    public static void main(String[] args) {

        //Non-Primitif memiliki default value & null & punya method
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //konversi

        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
    }
}
