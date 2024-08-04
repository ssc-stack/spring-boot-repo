package com.shashank.social_media_app.controller;

import com.shashank.social_media_app.entity.User;
import com.shashank.social_media_app.exception.UserNotFoundException;
import com.shashank.social_media_app.service.UserDaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
        Optional<User> optionalUser=userDaoService.findOne(id);
        if(optionalUser.isEmpty()) throw new UserNotFoundException("User Not Found with ID:"+id);

        return optionalUser.get();
    }

    @PostMapping
    public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
        User savedUser=userDaoService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().cloneBuilder().
                path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path="delete/id/{id}")
    public void deleteUser(@PathVariable  int id) {
        userDaoService.deleteUser(id);
    }
}
