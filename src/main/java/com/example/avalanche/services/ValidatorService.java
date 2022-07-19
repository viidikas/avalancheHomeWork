package com.example.avalanche.services;

public class ValidatorService {

    public boolean operandValidator(String op) {
        if(op.isEmpty() || op.isBlank()) {
            return false;
        } else return op.equals("div") || op.equals("sub") || op.equals("prod") || op.equals("sum");
    }
}
