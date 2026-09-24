package com.taskmanager.taskmanagementsystem.service;

import com.taskmanager.taskmanagementsystem.entity.User;
import com.taskmanager.taskmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {

        Optional<User> optionalUser = userRepository.findByEmailAndPassword(email,password);
        if (optionalUser.isEmpty()){
            return null;
        }
        User userOb = optionalUser.get();
        return userOb;

//        User userObj = userRepository.findByEmail(email);
//
//        if(userObj != null && userObj.getPassword().equals(password)) {
//            return userObj;
//        }
//
//        return null;
    }
}