package com.example.hw_18;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double plus(double num1,double num2){
        return num1+num2;
    }public double minus(double num1,double num2){
        return num1-num2;
    }public double division(double num1,double num2){
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1/num2;
    }public double multiply(double num1,double num2){
        return num1*num2;
    }

}
