package com.juho.springboottest.controller;

import com.juho.springboottest.model.MyUser;
import com.juho.springboottest.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/get/no/{userNo}", method = RequestMethod.GET)
    public Optional<MyUser> getUserForNo(@PathVariable int userNo) {
        return userRepository.findById(userNo);
    }
}
