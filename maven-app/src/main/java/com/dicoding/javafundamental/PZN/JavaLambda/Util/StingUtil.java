package com.dicoding.javafundamental.PZN.JavaLambda.Util;

public class StingUtil {

    public static boolean isLowerCase(String value){
        for(var c : value.toCharArray()){
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
