package com.example.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    void testFirstNumberGreater() {
        assertEquals("First number is greater", NumberComparator.compareNumbers(5, 3));
    }

    @Test
    void testSecondNumberGreater() {
        assertEquals("Second number is greater", NumberComparator.compareNumbers(3, 5));
    }

    @Test
    void testNumbersAreEqual() {
        assertEquals("Numbers are equal", NumberComparator.compareNumbers(5, 5));
    }
}
