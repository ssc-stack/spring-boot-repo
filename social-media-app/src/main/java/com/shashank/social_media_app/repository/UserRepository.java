package com.shashank.social_media_app.repository;


import com.shashank.social_media_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
