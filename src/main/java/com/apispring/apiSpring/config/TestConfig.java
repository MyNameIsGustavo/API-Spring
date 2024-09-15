package com.apispring.apiSpring.config;

import com.apispring.apiSpring.entities.User;
import com.apispring.apiSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        User objUser = new User(null, "Joao@gmail.com", "Joao", "123");
        User objUser2 = new User(null, "Maria@gmail.com", "Maria", "123");

        userRepository.saveAll(Arrays.asList(objUser, objUser2));
    }
}