package main.java.lesson02_oop;

/**
 * Interface defining the contract for all payment types.
 */
public interface PaymentMethod {
    void processPayment(double amount);
    String getProviderName();
}