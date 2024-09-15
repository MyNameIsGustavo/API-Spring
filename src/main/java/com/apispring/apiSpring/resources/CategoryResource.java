package com.apispring.apiSpring.resources;

import com.apispring.apiSpring.entities.Category;
import com.apispring.apiSpring.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> objListCategory = service.findAll();
        return ResponseEntity.ok().body(objListCategory);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findByID(@PathVariable Long id) {
        Category objCategory = service.findByID(id);
        return ResponseEntity.ok().body(objCategory);
    }

}
