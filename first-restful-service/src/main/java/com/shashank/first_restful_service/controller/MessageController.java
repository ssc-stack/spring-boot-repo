package com.shashank.first_restful_service.controller;

import com.shashank.first_restful_service.entity.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping(path="hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping(path = "hello/{name}")
    public Message sayHelloWithName(@PathVariable("name") String q) {
        return new Message("Hello "+q+ "! Welcome");
    }
}
