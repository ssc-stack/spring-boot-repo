package com.shashank.social_media_app.repository;

import com.shashank.social_media_app.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
