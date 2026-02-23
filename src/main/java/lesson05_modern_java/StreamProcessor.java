package main.java.lesson05_modern_java;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Lesson 5: Modern Java
 * Topic: Lambdas and Stream API
 * Description: Processing a product catalog using functional programming.
 */
public class StreamProcessor {

    public static void main(String[] args) {
        List<Product> catalog = Arrays.asList(
            new Product("Laptop", "Electronics", 1200.00),
            new Product("Phone", "Electronics", 800.00),
            new Product("Coffee Maker", "Kitchen", 150.00),
            new Product("Blender", "Kitchen", 100.00),
            new Product("Monitor", "Electronics", 300.00),
            new Product("Desk Lamp", "Office", 45.00)
        );

        System.out.println("=== Modern Data Processing with Streams ===");

        // 1. Filtering and Mapping
        // Task: Get the names of all Electronics over $500
        List<String> premiumElectronics = catalog.stream()
            .filter(p -> p.getCategory().equals("Electronics")) // Lambda: Predicate
            .filter(p -> p.getPrice() > 500)
            .map(Product::getName) // Method Reference: Transform Product to String
            .collect(Collectors.toList());

        System.out.println("Premium Electronics: " + premiumElectronics);

        // 2. Sorting and Limiting
        // Task: Get the 3 cheapest products in the catalog
        List<Product> budgetOptions = catalog.stream()
            .sorted(Comparator.comparingDouble(Product::getPrice))
            .limit(3)
            .collect(Collectors.toList());

        System.out.println("\nTop 3 Budget Options:");
        budgetOptions.forEach(System.out::println);

        // 3. Aggregating (Reduce/Sum)
        // Task: Calculate the total value of all Kitchen items
        double kitchenTotal = catalog.stream()
            .filter(p -> p.getCategory().equals("Kitchen"))
            .mapToDouble(Product::getPrice)
            .sum();

        System.out.printf("\nTotal value of Kitchen Inventory: $%.2f\n", kitchenTotal);
    }
}