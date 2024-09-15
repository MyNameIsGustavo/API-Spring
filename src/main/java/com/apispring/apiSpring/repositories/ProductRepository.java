package com.apispring.apiSpring.repositories;

import com.apispring.apiSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
