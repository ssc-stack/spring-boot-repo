package com.shashank.social_media_app.service;

import com.shashank.social_media_app.entity.User;
import com.shashank.social_media_app.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class UserDaoService {

    private UserRepository userRepository;

    public UserDaoService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findOne(int id) {
        return userRepository.findById(id);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
