package com.shashank.social_media_app.controller;

import com.shashank.social_media_app.entity.User;
import com.shashank.social_media_app.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {


    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService=userDaoService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userDaoService.findAll();
    }

    @GetMapping(path="/id/{id}")
    public User getUserById(@PathVariable int id) {
        return userDaoService.findOne(id);
    }
}
