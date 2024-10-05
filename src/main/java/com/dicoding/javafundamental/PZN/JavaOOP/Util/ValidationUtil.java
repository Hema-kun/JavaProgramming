package com.dicoding.javafundamental.PZN.JavaOOP.Util;

import com.dicoding.javafundamental.PZN.JavaOOP.Data.LoginRequest;
import com.dicoding.javafundamental.PZN.JavaOOP.Error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("USername is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");

        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }
}
