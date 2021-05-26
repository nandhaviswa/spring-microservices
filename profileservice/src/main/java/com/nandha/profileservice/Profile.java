package com.nandha.profileservice;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Profile {
    @Id
    public int userId;
    public String firstName;
    public String lastName;
}
