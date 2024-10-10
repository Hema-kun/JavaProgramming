package com.dicoding.javafundamental.PZN.JavaLambda.App;

import com.dicoding.javafundamental.PZN.JavaLambda.Util.StingUtil;

import java.util.function.Predicate;

public class MethodReferrenceApp {

    public static void main(String[] args) {

        //Predicate<String> predicateIsLowerCase = s -> StingUtil.isLowerCase(s);
        Predicate<String> predicateIsLowerCase = StingUtil::isLowerCase;;


        System.out.println(predicateIsLowerCase.test("Heru"));
        System.out.println(predicateIsLowerCase.test("heru"));
    }

    public void run(){

        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Heru"));
        System.out.println(predicateIsLowerCase.test("heru"));

    }

    public boolean isLowerCase(String value){
        for(var c : value.toCharArray()){
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
