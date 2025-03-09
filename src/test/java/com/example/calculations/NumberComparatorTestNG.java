package com.example.calculations;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTestNG {

    @Test
    public void testFirstNumberGreater() {
        assertEquals(NumberComparator.compareNumbers(5, 3), "First number is greater");
    }

    @Test
    public void testSecondNumberGreater() {
        assertEquals(NumberComparator.compareNumbers(3, 5), "Second number is greater");
    }

    @Test
    public void testNumbersAreEqual() {
        assertEquals(NumberComparator.compareNumbers(5, 5), "Numbers are equal");
    }
}
