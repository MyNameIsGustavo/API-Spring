package com.apispring.apiSpring.repositories;

import com.apispring.apiSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
