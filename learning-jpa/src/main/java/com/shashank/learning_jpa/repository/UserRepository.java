package com.shashank.learning_jpa.repository;

import com.shashank.learning_jpa.entity.CustomerUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<CustomerUser, Integer> {

    List<CustomerUser> findByName(String shashank);
}
