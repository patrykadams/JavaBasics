# Java Mastery: Pareto Principle Curriculum

This repository demonstrates core Java competencies by focusing on the high-impact concepts that handle the majority of real-world use cases. The project is structured into modular lessons, each following industry best practices and clean code principles.

## Project Roadmap

### 1. Foundations
- **Location**: `src/lesson01_foundations/`
- **Key Concepts**: Logic gates, primitive types, array iteration, and algorithmic efficiency.
- **Demo**: `FoundationProcessor.java` - A statistical tool and prime number filter.

### 2. Object-Oriented Programming (OOP)
- **Location**: `src/lesson02_oop/`
- **Key Concepts**: Inheritance, Encapsulation, Polymorphism, and Interface-driven design.
- **Demo**: `PaymentSystemDemo.java` - A decoupled payment processing system handling multiple providers through a unified contract.

### 3. Data Management (Collections)
- **Location**: `src/lesson03_collections/`
- **Key Concepts**: Dynamic data structures (List, Set, Map) and data modeling (POJOs).
- **Demo**: `UserManagementSystem.java` - Efficient data storage and O(1) retrieval logic.

### 4. Robustness (Exception Handling)
- **Location**: `src/lesson04_robustness/`
- **Key Concepts**: try-catch-finally blocks, checked vs. unchecked exceptions, and custom business logic exceptions.
- **Demo**: `ExceptionDemo.java` - A banking simulation that handles insufficient funds without crashing.

---

## How to Run
1. Clone the repository.
2. Ensure you have JDK 17 or higher installed.
3. Navigate to the `src` directory.
4. Compile and run any main class using:
   ```bash
   javac lessonX_package/ClassName.java
   java lessonX_package.ClassName