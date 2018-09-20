package com.example.poligonSpring.security.service;

import com.example.poligonSpring.model.User;
import com.example.poligonSpring.model.UserRepo;
import com.example.poligonSpring.security.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username: '{}' ", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }

}
