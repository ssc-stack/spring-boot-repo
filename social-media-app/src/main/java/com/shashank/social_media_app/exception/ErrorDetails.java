package com.shashank.social_media_app.exception;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class ErrorDetails {
    private LocalDateTime timestamp;
    private String message;
    private String details;


    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
