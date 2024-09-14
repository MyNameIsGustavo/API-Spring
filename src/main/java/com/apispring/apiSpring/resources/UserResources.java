package com.apispring.apiSpring.resources;

import com.apispring.apiSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

        @GetMapping
        public ResponseEntity<User> findAll(){
            User objUser = new User("123", "Maria@gmail.com", "Maria", 1L);
            return ResponseEntity.ok().body(objUser);
        }
}
