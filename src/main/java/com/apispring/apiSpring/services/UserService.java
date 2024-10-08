package com.apispring.apiSpring.services;

import com.apispring.apiSpring.entities.User;
import com.apispring.apiSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findByID(long ID){
        Optional<User> objUser = repository.findById(ID);
        return objUser.get();
    }

    public User insert (User object){
        return repository.save(object);
    }

    public void delete (Long id){
         repository.deleteById(id);
    }

    public User update (Long id, User objUser){
        User entity = repository.getReferenceById(id);
        updateData(entity, objUser);
        return repository.save(entity);
    }

    private void updateData(User entity, User objUser){
        entity.setName(objUser.getName());
        entity.setEmail(objUser.getEmail());
    }
}
