package com.example.avalanche.rest;

import com.example.avalanche.services.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    private final CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, world!";
    }

    @GetMapping("/calculate")
    public Long calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String op) {
       return calculatorService.calculate(num1, num2, op);
    }
}
