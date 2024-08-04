package com.shashank.social_media_app.service;

import com.shashank.social_media_app.entity.Post;
import com.shashank.social_media_app.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository=postRepository;
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}
