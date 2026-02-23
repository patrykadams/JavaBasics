package main.java.lesson02_oop;

/**
 * Credit Card implementation of PaymentMethod.
 */
public class CreditCardPayment extends BasePayment implements PaymentMethod {
    
    public CreditCardPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Authorization...");
        logTransaction(getProviderName(), amount);
    }

    @Override
    public String getProviderName() {
        return "VISA/MASTERCARD";
    }
}