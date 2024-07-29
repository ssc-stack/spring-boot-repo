package com.shashank.learning_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

record User(int id,String name,int age){};

@RestController
public class UserController {

    @RequestMapping("users")
    public List<User> getUsers() {
        List<User> userList=new ArrayList<>();
        userList.add(new User(1,"Shashank",25));
        userList.add(new User(2,"Elon",40));
        userList.add(new User(3,"Amber",39));
        userList.add(new User(3,"Johnny",52));

        return userList;
    }
}
