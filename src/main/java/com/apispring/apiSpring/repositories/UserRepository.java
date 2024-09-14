package com.apispring.apiSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apispring.apiSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
