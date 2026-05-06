package com.mvc.java;

import com.mvc.java.java.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for Calculator.
 */
public class AppTest {

    @Test
    void calculatorTest() {
        Calculator c = new Calculator();

        int result = c.add(2, 3);

        assertEquals(4, result);
    }
}