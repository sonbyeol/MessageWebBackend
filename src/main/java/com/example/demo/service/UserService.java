package com.example.demo.service;

// UserService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.User;
import com.example.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    
	@Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id " + id));
    }



    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Other methods for CRUD operations
}