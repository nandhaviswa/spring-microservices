package com.nandha.userservice;

import com.nandha.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(User model){
        return userRepository.save(model);
    }

    public List<User> list(){
        return userRepository.findAll();
    }
}
