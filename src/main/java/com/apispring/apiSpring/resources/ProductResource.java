package com.apispring.apiSpring.resources;

import com.apispring.apiSpring.entities.Product;
import com.apispring.apiSpring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByID(@PathVariable Long ID){
        Product objProduct = productService.findByID(ID);

        return  ResponseEntity.ok().body(objProduct);
    }

    public ResponseEntity<List<Product>> findAll(){
        List<Product> objProduct = productService.findAll();

        return ResponseEntity.ok().body(objProduct);
    }
}
