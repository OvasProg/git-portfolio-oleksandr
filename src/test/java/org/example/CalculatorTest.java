package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new BasicCalculator();

    @Test
    void testAddition() {
        double result = calculator.calculate(5.0, 3.0, Operation.ADD);
        assertEquals(8.0, result, "5 + 3 should equal 8");
    }

    @Test
    void testSubtraction() {
        double result = calculator.calculate(10.0, 4.0, Operation.SUBTRACT);
        assertEquals(6.0, result, "10 - 4 should equal 6");
    }

    @Test
    void testDivisionByZeroThrowsException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.calculate(10.0, 0.0, Operation.DIVIDE);
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}