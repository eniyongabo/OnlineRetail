package edu.miu.cs.cs544.product.repository;

import edu.miu.cs.cs544.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProductRepository extends JpaRepository<Product, Long> {
}
