package com.example.hw_18;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {
        var actual = service.plus(1d, 2d);
        assertEquals(3d, actual);
        var actual2 = service.plus(-2d, -3d);
        assertEquals(-5d, actual2);
        var actual3 = service.plus(2d, 3d);
        assertEquals(5d, actual3);
        var actual4 = service.plus(-2d, 3d);
        assertEquals(1d, actual4);
    }

    @Test
    void testMinus() {
        var actual = service.minus(1d, 2d);
        assertEquals(-1d, actual);
        var actual2 = service.minus(-2d, -3d);
        assertEquals(1d, actual2);
        var actual3 = service.minus(2d, 3d);
        assertEquals(-1d, actual3);
        var actual4 = service.minus(-2d, 3d);
        assertEquals(-5d, actual4);
    }

    @Test
    void testDivision() {
        var actual = service.division(1d, 2d);
        assertEquals(2d, actual);
        var actual2 = service.division(-2d, -3d);
        assertEquals(6d, actual2);
        var actual3 = service.division(2d, 3d);
        assertEquals(6d, actual3);
        var actual4 = service.division(-2d, 3d);
        assertEquals(-6d, actual4);
    }

    @Test
    void testMultiply() {
        var actual = service.multiply(1d, 2d);
        assertEquals(0.5d, actual);
        var actual2 = service.multiply(-2d, -3d);
        assertEquals(0.6d, actual2);
        var actual3 = service.multiply(2d, 3d);
        assertEquals(0.6d, actual3);
        var actual4 = service.multiply(-6d, 3d);
        assertEquals(-2d, actual4);

    }
}