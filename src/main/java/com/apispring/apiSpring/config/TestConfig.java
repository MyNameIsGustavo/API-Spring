package com.apispring.apiSpring.config;

import com.apispring.apiSpring.entities.Order;
import com.apispring.apiSpring.entities.User;
import com.apispring.apiSpring.entities.enums.OrderStatus;
import com.apispring.apiSpring.repositories.OrderRepository;
import com.apispring.apiSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception{
        User objUser = new User(null, "Joao@gmail.com", "Joao", "123");
        User objUser2 = new User(null, "Maria@gmail.com", "Maria", "123");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, objUser);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, objUser2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, objUser);

        userRepository.saveAll(Arrays.asList(objUser, objUser2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}