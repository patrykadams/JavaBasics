package lesson02_oop;

/**
 * Lesson 2: Object-Oriented Programming (OOP)
 * Topic: Inheritance, Polymorphism, Interfaces, and Encapsulation.
 * * This module demonstrates:
 * - Decoupling code using Interfaces.
 * - Code reuse through Abstract Classes.
 * - Data protection via Encapsulation.
 * - Dynamic behavior via Polymorphism.
 */

// 1. Interface (The Contract)
interface PaymentMethod {
    void processPayment(double amount);
    String getProviderName();
}

// 2. Abstract Base Class (Encapsulation & Shared Logic)
abstract class BasePayment {
    private String transactionId; // Encapsulated field

    public BasePayment(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    protected void logTransaction(String provider, double amount) {
        System.out.println("Transaction [" + transactionId + "] via " + provider + ": $" + amount);
    }
}

// 3. Concrete Implementations (Inheritance)
class CreditCardPayment extends BasePayment implements PaymentMethod {
    public CreditCardPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Validating Credit Card...");
        logTransaction(getProviderName(), amount);
    }

    @Override
    public String getProviderName() {
        return "VISA/MASTERCARD";
    }
}

class PayPalPayment extends BasePayment implements PaymentMethod {
    public PayPalPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Authenticating PayPal Account...");
        logTransaction(getProviderName(), amount);
    }

    @Override
    public String getProviderName() {
        return "PAYPAL_SECURE";
    }
}

// 4. Main Demo Class (Polymorphism)
public class PaymentSystemDemo {
    public static void main(String[] args) {
        // Creating a collection of different types under one interface
        PaymentMethod[] payments = {
            new CreditCardPayment("TXN-778"),
            new PayPalPayment("TXN-992"),
            new CreditCardPayment("TXN-445")
        };

        System.out.println("=== Starting Payment Processing System ===");
        
        for (PaymentMethod p : payments) {
            p.processPayment(125.50);
            System.out.println("Status: Success\n");
        }
    }
}