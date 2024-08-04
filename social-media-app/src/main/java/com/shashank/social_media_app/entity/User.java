package com.shashank.social_media_app.entity;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
public class User {
    private int id;

    @Size(min=2, message = "Username should be of minimum length 2")
    private String name;

    @Past(message = "dob should be in the past")
    private LocalDate dob;

    public User(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
}
