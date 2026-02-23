package main.java.lesson01_foundations;

/**
 * Lesson 1: Foundations
 * Topic: Syntax, Logic, and Array Processing
 * * This module demonstrates the core building blocks of Java:
 * - Variable declaration and primitive types
 * - Control flow (if-else, for-each loops)
 * - Array manipulation
 * - Modular programming using static methods
 */

public class FoundationProcessor {

    public static void main(String[] args) {
        // Data input: A fixed array representing a dataset of integers
        int[] numbers = {12, 7, 15, 23, 4, 11, 18, 2, 9, 31, 45, 13};
        
        System.out.println("=== Java Foundation Analysis ===");
        System.out.println("Input Dataset: " + formatArray(numbers));
        
        // State management: Variables to store our calculated results
        int primeCount = 0;
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // Process the data using a for-each loop
        for (int num : numbers) {
            // Logic: Identify prime numbers
            if (isPrime(num)) {
                System.out.println("-> Prime detected: " + num);
                primeCount++;
            }

            // Logic: Aggregate sum for average calculation
            sum += num;

            // Logic: Find Extremes (Max/Min)
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // Calculation: Performing division with type casting for precision
        double average = (double) sum / numbers.length;

        // Final output presentation
        displayResults(sum, average, primeCount, max, min);
    }

    /**
     * Checks if a number is prime.
     * Efficiency: O(sqrt(n)) complexity.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        // Optimization: Check only up to the square root
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Formats an array into a readable string.
     * Demonstrates StringBuilder for efficient string concatenation in loops.
     */
    public static String formatArray(int[] arr) {
        if (arr.length == 0) return "[]";
        
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Prints the summary of the processing.
     */
    private static void displayResults(int sum, double avg, int primes, int max, int min) {
        System.out.println("\n--- Statistical Summary ---");
        System.out.println("Total Sum:       " + sum);
        System.out.printf("Average Value:   %.2f\n", avg);
        System.out.println("Highest Value:   " + max);
        System.out.println("Lowest Value:    " + min);
        System.out.println("Total Primes:    " + primes);
        System.out.println("---------------------------");
    }
}