package com.example.poligonSpring.controller;

import com.example.poligonSpring.model.Authority;
import com.example.poligonSpring.service.AuthorityService;
import com.example.poligonSpring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import com.example.poligonSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class TestController {

   @Autowired
    UserService userService;

   @Autowired
    AuthorityService authorityService;

    @RequestMapping(value = "/test/getUsers", method = RequestMethod.GET)
    public Iterable<User> getAllUsers() {

        log.info("Pobrano listę wszystkich userów");
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/test/getAuthorities", method = RequestMethod.GET)
    public Iterable<Authority> getAllAuthorities() {

        log.info("Pobrano listę wszystkich ról");
        return authorityService.getAllAuthorities();
    }

//    @Scheduled(cron = "1/5 * * * * ?")
//    public void logCurrentTime() {
//        log.info("Current time: {}", new Date());
//    }

}
