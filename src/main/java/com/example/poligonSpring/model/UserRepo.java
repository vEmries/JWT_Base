package com.example.poligonSpring.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {

    List<User> findAll();
    User findById(Integer ID);
    User findByUsername(String username);
}
