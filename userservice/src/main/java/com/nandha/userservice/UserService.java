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
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC_NAME="user.created";

    public User create(User model){
        User saved=userRepository.save(model);
        kafkaTemplate.send(UserService.TOPIC_NAME,saved.getUsername(),saved);
        return saved;
    }

    public List<User> list(){
        return userRepository.findAll();
    }
}
