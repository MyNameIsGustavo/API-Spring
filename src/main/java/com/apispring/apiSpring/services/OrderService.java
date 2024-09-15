package com.apispring.apiSpring.services;

import com.apispring.apiSpring.entities.Order;
import com.apispring.apiSpring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> objOrder = repository.findById(id);
        return objOrder.get();
    }
}
