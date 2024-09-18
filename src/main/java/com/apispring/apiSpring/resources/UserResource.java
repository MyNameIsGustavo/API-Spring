package com.apispring.apiSpring.resources;

import com.apispring.apiSpring.entities.Order;
import com.apispring.apiSpring.entities.User;
import com.apispring.apiSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

        @PostMapping()
        public ResponseEntity<User> insert(@RequestBody User object){
            User objUser = service.insert(object);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objUser.getId()).toUri();
            return ResponseEntity.created(uri).body(objUser);
        }

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<Void> delete(@PathVariable Long id){
            service.delete(id);
            return ResponseEntity.noContent().build();
        }

        @PutMapping(value = "/{id}")
        public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User objectRequest){
          User object = service.update(id, objectRequest);
          return ResponseEntity.ok().body(object);
        }
}
