package com.example.avalanche.rest;

import com.example.avalanche.services.CalculatorService;
import com.example.avalanche.services.ValidatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    private final CalculatorService calculatorService = new CalculatorService();
    private final ValidatorService validatorService = new ValidatorService();

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world!";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String op) {
        if (validatorService.operandValidator(op)) {
            return calculatorService.calculate(num1, num2, op);
        } else
            return "Oops, you have something wrong with the operand!";
    }
}
