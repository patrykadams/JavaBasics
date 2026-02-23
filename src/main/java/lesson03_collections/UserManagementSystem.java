package main.java.lesson03_collections;

import java.util.*;

/**
 * Lesson 3: Collections
 * Demonstrates List (Order), Set (Uniqueness), and Map (Key-Value Lookup).
 */
public class UserManagementSystem {

    public static void main(String[] args) {
        // 1. LIST: Maintaining an ordered history of login attempts (allows duplicates)
        List<String> loginAttempts = new ArrayList<>();
        loginAttempts.add("admin");
        loginAttempts.add("guest");
        loginAttempts.add("admin"); // Duplicate attempt
        loginAttempts.add("editor");

        System.out.println("Login History (List): " + loginAttempts);

        // 2. SET: Identifying unique users who attempted to log in
        // Passing the list into the HashSet constructor automatically removes duplicates.
        Set<String> uniqueLogins = new HashSet<>(loginAttempts);
        System.out.println("Unique Users (Set): " + uniqueLogins);

        // 3. MAP: Storing full profiles for fast retrieval via username
        Map<String, UserProfile> userDatabase = new HashMap<>();
        
        userDatabase.put("admin", new UserProfile("admin", "admin@company.com", "SUPERUSER"));
        userDatabase.put("editor", new UserProfile("editor", "edit@company.com", "CONTENT_CREATOR"));
        userDatabase.put("guest", new UserProfile("guest", "guest@temp.com", "VISITOR"));

        // Fast Lookup (Industry Standard for data retrieval)
        String searchKey = "editor";
        if (userDatabase.containsKey(searchKey)) {
            UserProfile profile = userDatabase.get(searchKey);
            System.out.println("\n--- Profile Found ---");
            System.out.println("Details: " + profile);
            System.out.println("Contact: " + profile.getEmail());
        }

        // Iterating through a Map
        System.out.println("\n--- Full User Registry ---");
        for (Map.Entry<String, UserProfile> entry : userDatabase.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}