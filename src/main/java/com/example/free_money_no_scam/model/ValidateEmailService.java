package com.example.free_money_no_scam.model;

public class ValidateEmailService {

    public boolean isEmailValid(String email){
        if (email.contains("@") && email.contains(".")
        && email.length()>5){
            return true;
        }
        return false;
    }
}
