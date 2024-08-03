package com.shashank.learning_jpa;

import com.shashank.learning_jpa.entity.CustomerUser;
import com.shashank.learning_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new CustomerUser("shashank",25));
        userRepository.save(new CustomerUser("elon",45));
        userRepository.save(new CustomerUser("johnny depp",39));

        System.out.println(userRepository.findAll());
        System.out.println(userRepository.findById(3));
        System.out.println(userRepository.findByName("shashank"));
    }
}
