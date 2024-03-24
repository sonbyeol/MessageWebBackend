package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.repository.User;
import com.example.demo.service.UserService;
@CrossOrigin(origins = "*") // 모든 출처에서의 요청을 허용합니다.
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
	
    @GetMapping("/findAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/find/{ID}")
    public User getUserById(@PathVariable("ID") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }



    @DeleteMapping("/delete/{ID}")
    public void deleteUser(@PathVariable("ID") Long id) {
        userService.deleteUser(id);
    }

    // Other methods for CRUD operations
}