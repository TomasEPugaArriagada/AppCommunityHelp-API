package com.proyectotitulo.proyectorest.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyectotitulo.proyectorest.Entity.User;
import com.proyectotitulo.proyectorest.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public Boolean loginUser(@RequestBody User user) {
        return true;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);;
    }

    @GetMapping("/{id}")
    public User getMethodName(@PathVariable Long id) {
        return userRepository.getReferenceById(id);
    }
    

    @GetMapping("/Schema")
    public User getSchema() {
        return new User();
    }
    
}
