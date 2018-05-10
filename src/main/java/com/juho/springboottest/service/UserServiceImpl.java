package com.juho.springboottest.service;

import com.juho.springboottest.model.MyUser;
import com.juho.springboottest.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserServiceImpl implements UserService{

    private AtomicInteger curSeq = new AtomicInteger(0);

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

    @Override
    public void createUser(String name) {
        MyUser user = new MyUser();
        user.setUserNo(curSeq.incrementAndGet());
        user.setUserName(name);
        userRepository.save(user);
    }

    @Override
    public void updateUser(String name) {

    }

    @Override
    public void deleteUser(String name) {

    }
}
