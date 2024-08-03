package com.shashank.social_media_app.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private int id;
    private int name;
    private LocalDateTime dob;
}
