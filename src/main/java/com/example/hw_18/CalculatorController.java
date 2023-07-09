package com.example.hw_18;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    public String calculator() {
        return "Добро пожаловать в калькулятор ";
    }
    @RequestMapping(path="/calculator")
    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    @RequestMapping ("/calculator/plus")
    public String plus(@RequestParam int num1,@RequestParam int num2) {

        return num1+"+"+num2+"="+service.plus(num1,num2);
    }
    @GetMapping ("/calculator/minus")
    public String minus(@RequestParam int num1,@RequestParam int num2) {

        return num1+"-"+num2+"="+service.minus(num1,num2);
    }
    @GetMapping ("/calculator/division")
    public String division(@RequestParam int num1,@RequestParam int num2) {
        if (num2==0){
            return "на 0 делить нельзя";
        }

        return num1+"/"+num2+"="+service.division(num1,num2);
    }
    @GetMapping ("/calculator/multiplication")
    public String multiplication(@RequestParam int num1,@RequestParam int num2) {

        return num1+"*"+num2+"="+service.multiply(num1,num2);
    }
}