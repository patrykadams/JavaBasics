package main.java.lesson04_robustness;

/**
 * Custom Exception for banking logic.
 * Extending Exception makes this a 'Checked' exception.
 */
public class InsufficientFundsException extends Exception {
    private final double shortfall;

    public InsufficientFundsException(double shortfall) {
        super("Transaction failed: You are short $" + shortfall);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}