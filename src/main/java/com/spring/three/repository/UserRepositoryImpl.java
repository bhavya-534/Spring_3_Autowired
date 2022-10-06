package com.spring.three.repository;

import com.spring.three.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {


    public List<User> findData() {

        List<User> list = new ArrayList<User>();

        User user1 = new User("Bhavya","Ch");
        User user2 = new User("Saiki","M");

        list.add(user1);
        list.add(user2);

        return list;
    }
}
