package com.apispring.apiSpring.resources;

import com.apispring.apiSpring.entities.Order;
import com.apispring.apiSpring.entities.User;
import com.apispring.apiSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

        @Autowired
        private UserService service;

        @GetMapping
        public ResponseEntity<List<User>> findAll(){

            List<User> list = service.findAll();

            return ResponseEntity.ok().body(list);
        }


        @GetMapping(value = "/{id}")
        public ResponseEntity<User> findByID(@PathVariable Long id){
            User objUser = service.findByID(id);
            return ResponseEntity.ok().body(objUser);
        }
}
