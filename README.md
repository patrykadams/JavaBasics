# Java Technical Mastery: Core Curriculum

This repository demonstrates essential Java competencies by focusing on the high-impact concepts used in modern backend development. The project is organized into modular lessons, following industry standards for clean code and project structure.

## Project Roadmap

### 1. Foundations
- **Path**: `src/main/java/lesson01_foundations/`
- **Focus**: Logic, loops, and array manipulation.
- **Key Demo**: `FoundationProcessor.java` - Performs statistical analysis and prime number filtering on datasets.

### 2. Object-Oriented Programming (OOP)
- **Path**: `src/main/java/lesson02_oop/`
- **Focus**: Interface-driven design, inheritance, and encapsulation.
- **Key Demo**: `PaymentSystemDemo.java` - A decoupled payment system demonstrating polymorphism across different providers.

### 3. Data Management (Collections)
- **Path**: `src/main/java/lesson03_collections/`
- **Focus**: Dynamic data structures (List, Set, Map).
- **Key Demo**: `UserManagementSystem.java` - Efficient data storage and O(1) retrieval using HashMaps.

### 4. Robustness (Exception Handling)
- **Path**: `src/main/java/lesson04_robustness/`
- **Focus**: Defensive programming and custom business exceptions.
- **Key Demo**: `ExceptionDemo.java` - A banking simulation that handles error states without application crashes.

### 5. Modern Java (Lambdas and Streams)
- **Path**: `src/main/java/lesson05_modern_java/`
- **Focus**: Functional programming and declarative data pipelines.
- **Key Demo**: `StreamProcessor.java` - Advanced filtering and transformation of collections using the Stream API.

### 6. The Professional Layer (Testing)
- **Path**: `src/main/java/lesson06_testing/`
- **Focus**: Automated Unit Testing and Build Management.
- **Key Demo**: `CalculatorTest.java` - JUnit 5 tests ensuring logic reliability.

### 7. Spring Boot API
- **Path**: `src/main/java/lesson07_spring/`
- **Focus**: Building RESTful Web Services and handling HTTP requests.
- **Key Demo**: `GreetingController.java` - A live API endpoint that returns JSON data to a browser or mobile app.

---

## Technical Setup

### Build System
This project uses **Maven** for dependency management.
- **Java Version**: 17 or higher
- **Testing Framework**: JUnit 5

### How to Run (IDE)
The easiest way to run this project is using an IDE like **IntelliJ IDEA** or **VS Code**:
1. Open the project folder.
2. Locate the `main` method in any lesson's `.java` file.
3. Click the **Run** (Play) button next to the method.

### How to Run Tests
To verify the logic in Lesson 6:
1. Navigate to `src/test/java/lesson06_testing/CalculatorTest.java`.
2. Right-click the file and select **Run 'CalculatorTest'**.
3. Alternatively, use the IDE's **Maven** tool window and run the **test** lifecycle.

---

## Best Practices Observed
- **Standard Directory Layout**: Follows the Maven `src/main/java` and `src/test/java` convention.
- **Separation of Concerns**: Business logic is separated from runner classes and tests.
- **Self-Documenting Code**: Meaningful naming conventions and English comments.
- **Decoupling**: Extensive use of Interfaces to ensure code flexibility.