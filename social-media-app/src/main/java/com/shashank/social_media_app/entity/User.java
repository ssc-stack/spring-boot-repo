package com.shashank.social_media_app.entity;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
public class User {
    private int id;
    private String name;
    private LocalDate dob;

    public User(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
}
