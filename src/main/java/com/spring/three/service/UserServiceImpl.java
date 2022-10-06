package com.spring.three.service;

import com.spring.three.model.User;
import com.spring.three.repository.UserRepository;
import com.spring.three.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserRepository repository;


    //Setter Injection

//     @Autowired
//    public void setData(UserRepository repository)
//    {
//        System.out.println("With the help of Setter Injection");
//        this.repository=repository;
//    }


    public List<User> manipulateData() {
        System.out.println("Autowired is working...");
        return repository.findData();
    }

    //Constructor Injection
    @Autowired
    public UserServiceImpl() {
        System.out.println("With the help of Constructor Injection");
        this.repository = new UserRepositoryImpl();
    }


}
