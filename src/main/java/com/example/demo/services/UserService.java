package com.example.demo.services;

import com.example.demo.user.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    public List<User> getUsers(){
        return List.of(new User("test","test2","test3"));
    }
}
