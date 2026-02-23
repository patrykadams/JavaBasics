package main.java.lesson03_collections;

/**
 * Data model representing a user.
 * Best Practice: Use 'final' for fields that shouldn't change after creation.
 */
public class UserProfile {
    private final String username;
    private final String email;
    private final String role;

    public UserProfile(String username, String email, String role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "User: " + username + " (" + role + ")";
    }
}