package com.shashank.social_media_app.controller;

import com.shashank.social_media_app.entity.User;
import com.shashank.social_media_app.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService=userDaoService;
    }

    @GetMapping(path="users/find-all")
    public List<User> getUsers() {
        return userDaoService.findAll();
    }
}
