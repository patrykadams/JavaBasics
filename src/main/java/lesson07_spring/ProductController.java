package lesson07_spring;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products") // Base path for all methods in this class
public class ProductController {

    private final ProductService productService;

    // Dependency Injection: Spring provides the service automatically
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductData> getProducts(@RequestParam(required = false) String category) {
        if (category != null) {
            return productService.getProductsByCategory(category);
        }
        return productService.getAllProducts();
    }
}