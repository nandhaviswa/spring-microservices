package com.nandha.profileservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/create")
    public Profile create(@RequestBody Profile model){
        return profileService.create(model);
    }

    @GetMapping("/list")
    public List<Profile> list(){
        return profileService.list();
    }
}
