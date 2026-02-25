package lesson07_spring;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    // Spring generates this query automatically based on the method name!
    List<ProductEntity> findByCategoryIgnoreCase(String category);
}