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