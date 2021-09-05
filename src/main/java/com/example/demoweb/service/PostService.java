package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;
    @Autowired
    PostRepository postRepository;

    {
        posts = new ArrayList<>();
    }

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
            long newId = posts.size();
            posts.add(new Post(newId, text, new Date()));
            Post post = new Post(null, text, new Date());
            postRepository.save(post);
    }

}
