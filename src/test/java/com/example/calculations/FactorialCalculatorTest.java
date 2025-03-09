package com.example.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
    }

    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
    }
}
