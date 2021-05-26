package com.nandha.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody User model){
        return userService.create(model);
    }

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }
}
