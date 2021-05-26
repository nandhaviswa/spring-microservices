package com.nandha.profileservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile create(Profile model){
        return profileRepository.save(model);
    }

    public List<Profile> list(){
        return profileRepository.findAll();
    }
}
