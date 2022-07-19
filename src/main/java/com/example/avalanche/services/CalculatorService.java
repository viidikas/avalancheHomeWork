package com.example.avalanche.services;

public class CalculatorService {

    public Long calculate(int num1, int num2, String op) {
        return switch (op) {
            case "sum" -> (long) (num1 + num2);
            case "sub" -> (long) (num1 - num2);
            case "div" -> (long) (num1 / num2);
            case "prod" -> (long) (num1 * num2);
            default -> null;
        };
    }
}