package com.nandha.profileservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private UserRepository userRepository;

    public Profile create(Profile model){
        if(this.validate(model)){
            return profileRepository.save(model);
        }
        model.setUserId(0);
        return model;
    }

    public boolean validate(Profile model){
        Optional<User> optionalUser=userRepository.findById(model.userId);
        if(optionalUser.isPresent()){
            return true;
        }
        return false;
    }

    public List<Profile> list(){
        return profileRepository.findAll();
    }
}
