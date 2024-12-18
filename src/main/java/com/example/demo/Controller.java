package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private  UserRepo userRepo;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        User user1 = userRepo.save(user);
        return user1;
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userRepo.findAll();
    }
}
