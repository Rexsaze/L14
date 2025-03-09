package com.example.calculations;

public class NumberComparator {
    public static String compareNumbers(int a, int b) {
        if (a > b) {
            return "First number is greater";
        } else if (a < b) {
            return "Second number is greater";
        } else {
            return "Numbers are equal";
        }
    }
}
