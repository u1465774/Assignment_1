package com.example.service;

import com.example.domain.User;
import com.example.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Luke Hardman on 20/01/17.
 */
@Service
public class UserService {
    @Autowired
    protected UserRepository userRepository;

    public List<User> findAll() { return userRepository.findAll();  }

    public User save(User login) {  return userRepository.save(login);  }

}
