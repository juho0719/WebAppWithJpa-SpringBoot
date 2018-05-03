package com.juho.springboottest.service;

import com.juho.springboottest.model.MyUser;
import com.juho.springboottest.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public Optional<MyUser> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<MyUser> findByName(String name) {
        return userRepository.findByName(name);
    }

}
