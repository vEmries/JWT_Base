package com.example.poligonSpring.service;

import com.example.poligonSpring.model.Authority;
import com.example.poligonSpring.model.AuthorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class AuthorityService {

    @Autowired
    AuthorityRepo authorityRepo;

    @Transactional
    @Modifying
    public List<Authority> getAllAuthorities() {

        return authorityRepo.findAll();
    }
}
