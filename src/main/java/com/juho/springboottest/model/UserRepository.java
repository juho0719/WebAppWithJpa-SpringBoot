package com.juho.springboottest.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<MyUser, Integer>{
}
