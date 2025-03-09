package com.example.calculations;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaCalculatorTestNG {

    @Test
    public void testCalculateArea() {
        assertEquals(TriangleAreaCalculator.calculateArea(4, 5), 10.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeBase() {
        TriangleAreaCalculator.calculateArea(-4, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeHeight() {
        TriangleAreaCalculator.calculateArea(4, -5);
    }
}
