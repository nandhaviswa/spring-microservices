package com.nandha.userservice;

import com.nandha.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public User create(User model){
        User saved=userRepository.save(model);
        kafkaTemplate.send("user.create","nandha","nandha");
        return saved;
    }

    public List<User> list(){
        return userRepository.findAll();
    }
}
