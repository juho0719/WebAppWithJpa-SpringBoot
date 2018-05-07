package com.juho.springboottest.service;

import com.juho.springboottest.model.MyUser;

import java.util.Optional;

public interface UserService {
    Optional<MyUser> findById(int id);
    Optional<MyUser> findByName(String name);
    void createUser(String name);

}
