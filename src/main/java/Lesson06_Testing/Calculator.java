package Lesson06_Testing;

/**
 * A simple service to demonstrate unit testing.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}