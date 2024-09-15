package com.apispring.apiSpring.services;

import com.apispring.apiSpring.entities.Product;
import com.apispring.apiSpring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findByID(Long ID){
        Optional<Product> objProduct = productRepository.findById(ID);

        return objProduct.get();
    }
}
