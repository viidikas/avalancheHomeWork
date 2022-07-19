package com.example.avalanche.services;

import static java.lang.String.valueOf;

public class CalculatorService {

    public String calculate(int num1, int num2, String op) {
        return switch (op) {
            case "sum" -> valueOf(num1 + num2);
            case "sub" -> valueOf(num1 - num2);
            case "div" -> valueOf(num1 / num2);
            case "prod" -> valueOf(num1 * num2);
            default -> null;
        };
    }
}