package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class LikesService {

    @Autowired
    PostService postService;

    public int like(Long postId) {
        Post post = postService.listAllPosts().get(postId.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }

}
