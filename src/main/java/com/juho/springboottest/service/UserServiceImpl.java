package com.juho.springboottest.service;

import com.juho.springboottest.model.MyUser;
import com.juho.springboottest.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public MyUser findById(int id) {
//        MyUser myUser = userRepository.findById(id);
//        return myUser;
        return new MyUser();
    }
}
