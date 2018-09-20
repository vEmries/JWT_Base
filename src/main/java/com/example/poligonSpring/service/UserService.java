package com.example.poligonSpring.service;

import com.example.poligonSpring.model.User;
import com.example.poligonSpring.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepo userRepo;

    @Transactional
    @Modifying
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Transactional
    @Modifying
    public User getUserByID(Integer ID) {
        return userRepo.findById(ID);
    }
}
