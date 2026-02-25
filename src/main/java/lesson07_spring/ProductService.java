package lesson07_spring;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
        // Pre-loading some data for the demo
        this.repository.save(new ProductEntity("Gaming Laptop", "Electronics", 1500.0));
        this.repository.save(new ProductEntity("Office Chair", "Furniture", 250.0));
    }

    public List<ProductEntity> getAllProducts() {
        return repository.findAll();
    }

    public List<ProductEntity> getByCategory(String category) {
        return repository.findByCategoryIgnoreCase(category);
    }
}