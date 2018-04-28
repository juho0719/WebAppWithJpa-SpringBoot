package com.juho.springboottest.service;

import com.juho.springboottest.model.MyUser;

public interface UserService {

    MyUser findById(int id);
}
