package com.spring.three.repository;

import com.spring.three.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findData();
}
