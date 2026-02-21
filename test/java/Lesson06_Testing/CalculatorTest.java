package Lesson06_Testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Lesson 6: Testing
 * Demonstrates JUnit 5 assertions and test lifecycle.
 */
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Addition should return the correct sum")
    void testAddition() {
        assertEquals(10, calculator.add(7, 3), "7 + 3 should equal 10");
    }

    @Test
    @DisplayName("Division by zero should throw ArithmeticException")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    @DisplayName("isEven should return true for even numbers")
    void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(7));
    }
}