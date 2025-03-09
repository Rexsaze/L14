package com.example.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {

    @Test
    void testCalculateArea() {
        assertEquals(10.0, TriangleAreaCalculator.calculateArea(4, 5));
    }

    @Test
    void testNegativeBase() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(-4, 5));
    }

    @Test
    void testNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(4, -5));
    }
}
