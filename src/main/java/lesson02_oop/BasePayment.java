package lesson02_oop;

/**
 * Abstract class to provide shared logic and state for subclasses.
 * Demonstrates Encapsulation (private field) and protected methods.
 */
public abstract class BasePayment {
    private String transactionId;

    public BasePayment(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    protected void logTransaction(String provider, double amount) {
        System.out.println("ID: " + transactionId + " | Provider: " + provider + " | Amount: $" + amount);
    }
}