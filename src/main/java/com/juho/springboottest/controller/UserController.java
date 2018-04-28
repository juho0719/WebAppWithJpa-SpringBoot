package com.juho.springboottest.controller;

import com.juho.springboottest.model.MyUser;
import com.juho.springboottest.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

//    @RequestMapping(value="/get/no/{userNo}", method = RequestMethod.GET)
//    public MyUser getUserForNo(@PathVariable int userNo) {
//        MyUser user = userRepository.findById(userNo);
//        return user;
//    }
}
