package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("CalculatorTest")
class CalculatorTest {

    @Test
    void addTest() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add(3,3), "2 + 3 should equal 5");
    }
}