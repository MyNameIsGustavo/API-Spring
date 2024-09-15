package com.apispring.apiSpring.services;

import com.apispring.apiSpring.entities.Category;
import com.apispring.apiSpring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findByID(Long ID){
        Optional<Category> objCategory = repository.findById(ID);
        return objCategory.get();
    }
}
