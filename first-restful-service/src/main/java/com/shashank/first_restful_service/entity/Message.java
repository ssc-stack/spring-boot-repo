package com.shashank.first_restful_service.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Message {
    private String message;

    public Message(String message) {
        this.message=message;
    }
}
