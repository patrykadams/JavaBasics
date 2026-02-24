package lesson07_spring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * Service Layer: This is where the heavy lifting happens.
 * It keeps the Controller clean.
 */
@Service
public class ProductService {

    // Mock database of products
    private final List<ProductData> catalog = Arrays.asList(
        new ProductData("Laptop", "Electronics", 1200.00),
        new ProductData("Phone", "Electronics", 800.00),
        new ProductData("Coffee Maker", "Kitchen", 150.00),
        new ProductData("Blender", "Kitchen", 100.00)
    );

    public List<ProductData> getAllProducts() {
        return catalog;
    }

    public List<ProductData> getProductsByCategory(String category) {
        return catalog.stream()
            .filter(p -> p.getCategory().equalsIgnoreCase(category))
            .collect(Collectors.toList());
    }
}

/**
 * Simple record for data transfer (New in Modern Java).
 */
record ProductData(String name, String category, double price) {}