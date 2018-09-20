package com.example.poligonSpring.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorityRepo extends CrudRepository<Authority, Integer> {

    List<Authority> findAll();
    Authority findById(Integer ID);
}
