package com.example.hw_18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.*;


public class CalculatorServiceParameterTest {
    CalculatorService service = new CalculatorService();
    private static List<Arguments> parameter() {
        return List.of(
                Arguments.of(1, 2),
                Arguments.of(-2, -3),
                Arguments.of(2, -3),
                Arguments.of(-2, 3),
                Arguments.of(-2, 2));
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void test (double num1, double num2){
        assertEquals(num1 + num2), service.plus(num1,num2);
        assertEquals(num1 - num2), service.minus(num1,num2);
        assertEquals(num1 / num2), service.division(num1,num2);
        assertEquals(num1 * num2), service.multiply(num1,num2);
    }
    @Test
    void testZeroDivision() {
        assertThrows(IllegalArgumentException.class,()->service.division(2,0));
    }
}


